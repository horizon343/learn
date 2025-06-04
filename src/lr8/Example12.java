package lr8;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class Example12 {
    private static final Logger LOGGER = Logger.getLogger(Example8.class.getName());
    private static final String FILE_PATH = "src/lr8/example11.xlsx";
    private static final String SHEET_NAME = "Товары";
    private static final int MAX_RETRIES = 3;

    public static void main(String[] args) {
        int retryCount = 0;
        boolean success = false;

        while (retryCount < MAX_RETRIES && !success) {
            try {
                if (!Files.exists(Paths.get(FILE_PATH))) {
                    throw new IOException("Файл не найден: " + FILE_PATH);
                }

                try (FileInputStream inputStream = new FileInputStream(FILE_PATH);
                     XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

                    XSSFSheet sheet = workbook.getSheet(SHEET_NAME);
                    if (sheet == null) {
                        throw new IllegalArgumentException("Лист '" + SHEET_NAME + "' не найден в файле.");
                    }

                    for (Row row : sheet) {
                        for (Cell cell : row) {
                            System.out.print(cell.toString() + "\t");
                        }
                        System.out.println();
                    }

                    success = true;
                    LOGGER.info("Данные успешно прочитаны из файла: " + FILE_PATH);
                }
            } catch (IOException e) {
                retryCount++;
                LOGGER.warning("Попытка " + retryCount + " не удалась: " + e.getMessage());
                if (retryCount < MAX_RETRIES) {
                    System.err.println("Ошибка: " + e.getMessage());
                    System.err.println("Попытка повторного чтения (" + (retryCount + 1) + "/" + MAX_RETRIES + ")...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        LOGGER.severe("Повторная попытка прервана: " + ie.getMessage());
                        return;
                    }
                } else {
                    System.err.println("Ошибка: Не удалось прочитать файл после " + MAX_RETRIES + " попыток.");
                    System.err.println("Рекомендации:");
                    System.err.println("- Проверьте, существует ли файл: " + FILE_PATH);
                    System.err.println("- Убедитесь, что файл не поврежден и имеет формат .xlsx.");
                    System.err.println("- Проверьте, не открыт ли файл в другой программе.");
                }
            } catch (IllegalArgumentException e) {
                LOGGER.severe("Ошибка: " + e.getMessage());
                System.err.println("Ошибка: " + e.getMessage());
                System.err.println("Рекомендация: Проверьте наличие листа '" + SHEET_NAME + "' в файле и повторите попытку.");
                return;
            } catch (Exception e) {
                LOGGER.severe("Неожиданная ошибка: " + e.getMessage());
                System.err.println("Неожиданная ошибка: " + e.getMessage());
                System.err.println("Рекомендация: Проверьте формат файла и повторите попытку.");
                return;
            }
        }
    }
}