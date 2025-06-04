package lr8;

import org.w3c.dom.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Example9 {
    private Document doc;
    private final String xmlFilePath = "src/lr8/birthdays.xml";

    public Example9() {
        try {
            File xmlFile = new File(xmlFilePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            if (xmlFile.exists()) {
                doc = dBuilder.parse(xmlFile);
                doc.getDocumentElement().normalize();
            } else {
                doc = dBuilder.newDocument();
                Element rootElement = doc.createElement("birthdays");
                doc.appendChild(rootElement);
                saveXML();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void saveXML() {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(xmlFilePath));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addBirthday(String name, String date, String year) {
        try {
            Element root = doc.getDocumentElement();
            Element birthday = doc.createElement("birthday");

            Element nameElement = doc.createElement("name");
            nameElement.appendChild(doc.createTextNode(name));
            birthday.appendChild(nameElement);

            Element dateElement = doc.createElement("date");
            dateElement.appendChild(doc.createTextNode(date));
            birthday.appendChild(dateElement);

            Element yearElement = doc.createElement("year");
            yearElement.appendChild(doc.createTextNode(year));
            birthday.appendChild(yearElement);

            root.appendChild(birthday);
            saveXML();
            System.out.println("Birthday added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Element> searchBirthdays(String searchBy, String searchValue) {
        NodeList nodeList = doc.getElementsByTagName("birthday");
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(
                        new Iterator<Node>() {
                            int current = 0;

                            @Override
                            public boolean hasNext() {
                                return current < nodeList.getLength();
                            }

                            @Override
                            public Node next() {
                                return nodeList.item(current++);
                            }
                        }, Spliterator.ORDERED), false)
                .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                .map(node -> (Element) node)
                .filter(element -> {
                    String value = element.getElementsByTagName(searchBy).item(0).getTextContent();
                    return value.equalsIgnoreCase(searchValue);
                })
                .collect(Collectors.toList());
    }

    public boolean deleteBirthday(String name) {
        NodeList nodeList = doc.getElementsByTagName("birthday");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            String currentName = element.getElementsByTagName("name").item(0).getTextContent();
            if (currentName.equalsIgnoreCase(name)) {
                Node parentNode = element.getParentNode();
                parentNode.removeChild(element);
                saveXML();
                return true;
            }
        }
        return false;
    }

    public void displayAllBirthdays() {
        NodeList nodeList = doc.getElementsByTagName("birthday");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            String name = element.getElementsByTagName("name").item(0).getTextContent();
            String date = element.getElementsByTagName("date").item(0).getTextContent();
            String year = element.getElementsByTagName("year").item(0).getTextContent();
            System.out.println("Name: " + name + ", Date: " + date + ", Year: " + year);
        }
    }

    public static void main(String[] args) {
        Example9 parser = new Example9();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add new birthday");
            System.out.println("2. Search birthdays");
            System.out.println("3. Delete birthday");
            System.out.println("4. Display all birthdays");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter date (e.g., 15-05): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter year: ");
                    String year = scanner.nextLine();
                    parser.addBirthday(name, date, year);
                    break;

                case 2:
                    System.out.print("Search by (name/year): ");
                    String searchBy = scanner.nextLine();
                    System.out.print("Enter search value: ");
                    String searchValue = scanner.nextLine();
                    List<Element> results = parser.searchBirthdays(searchBy, searchValue);
                    if (results.isEmpty()) {
                        System.out.println("No results found.");
                    } else {
                        results.forEach(element -> {
                            String resultName = element.getElementsByTagName("name").item(0).getTextContent();
                            String resultDate = element.getElementsByTagName("date").item(0).getTextContent();
                            String resultYear = element.getElementsByTagName("year").item(0).getTextContent();
                            System.out.println("Name: " + resultName + ", Date: " + resultDate + ", Year: " + resultYear);
                        });
                    }
                    break;

                case 3:
                    System.out.print("Enter name to delete: ");
                    String nameToDelete = scanner.nextLine();
                    if (parser.deleteBirthday(nameToDelete)) {
                        System.out.println("Birthday deleted successfully!");
                    } else {
                        System.out.println("Birthday not found.");
                    }
                    break;

                case 4:
                    parser.displayAllBirthdays();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
