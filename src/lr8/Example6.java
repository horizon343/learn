package lr8;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Logger;

public class Example6 {
    private static final Logger LOGGER = Logger.getLogger(Example6.class.getName());
    private static final int MAX_RETRIES = 3;
    private static final String OUTPUT_FILE = "src/lr8/news_output.txt";

    public static void main(String[] args) {
        int retryCount = 0;
        boolean success = false;
        Document doc = null;

        while (retryCount < MAX_RETRIES && !success) {
            try {
                doc = Jsoup.connect("http://fat.urfu.ru/index.html")
                        .timeout(10000)
                        .get();
                success = true;
            } catch (IOException e) {
                retryCount++;
                LOGGER.warning("Connection attempt " + retryCount + " failed: " + e.getMessage());
                if (retryCount < MAX_RETRIES) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        LOGGER.severe("Retry interrupted: " + ie.getMessage());
                        return;
                    }
                } else {
                    LOGGER.severe("Failed to connect after " + MAX_RETRIES + " attempts: " + e.getMessage());
                    return;
                }
            }
        }

        if (doc != null) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(OUTPUT_FILE))) {
                Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > tr > td:nth-child(1)");

                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        try {
                            List<Node> nodes = newsParent.get(0).childNodes();
                            String title = ((Element) nodes.get(i)).getElementsByClass("blocktitle").get(0).childNodes().get(0).toString();
                            String date = ((Element) nodes.get(i)).getElementsByClass("blockdate").get(0).childNodes().get(0).toString();

                            System.out.println("Тема: " + title);
                            System.out.println("Дата: " + date + "\n");

                            writer.println("Тема: " + title);
                            writer.println("Дата: " + date);
                            writer.println();
                        } catch (IndexOutOfBoundsException | NullPointerException e) {
                            LOGGER.warning("Error parsing news item at index " + i + ": " + e.getMessage());
                        }
                    }
                }
                LOGGER.info("News data successfully written to " + OUTPUT_FILE);
            } catch (IOException e) {
                LOGGER.severe("Error writing to file: " + e.getMessage());
            }
        }
    }
}