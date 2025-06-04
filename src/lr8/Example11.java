package lr8;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class Example11 {
    private static final Logger LOGGER = Logger.getLogger(Example7.class.getName());
    private static final String FILE_PATH = "src/lr8/example11.xlsx";

    public static void main(String[] args) {
        try {
            String parentDir = Paths.get(FILE_PATH).getParent().toString();
            if (!Files.exists(Paths.get(parentDir))) {
                throw new IOException("Output directory does not exist: " + parentDir);
            }

            try (XSSFWorkbook workbook = new XSSFWorkbook()) {
                XSSFSheet sheet = workbook.createSheet("Товары");

                Row headerRow = sheet.createRow(0);
                headerRow.createCell(0).setCellValue("Товары");
                headerRow.createCell(1).setCellValue("Характеристики");
                headerRow.createCell(2).setCellValue("Стоимость");

                Row dataRow1 = sheet.createRow(1);
                dataRow1.createCell(0).setCellValue("Книга");
                dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
                dataRow1.createCell(2).setCellValue(500.0);

                Row dataRow2 = sheet.createRow(2);
                dataRow2.createCell(0).setCellValue("Компьютер");
                dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память: 8GB");
                dataRow2.createCell(2).setCellValue(25000.0);

                try (FileOutputStream outputStream = new FileOutputStream(FILE_PATH)) {
                    workbook.write(outputStream);
                    LOGGER.info("Данные успешно записаны в файл: " + FILE_PATH);
                    System.out.println("Данные успешно записаны в файл: " + FILE_PATH);
                }
            }
        } catch (IOException e) {
            LOGGER.severe("Ошибка при записи файла: " + e.getMessage());
            System.err.println("Ошибка: Не удалось записать файл " + FILE_PATH);
            System.err.println("Рекомендации:");
            System.err.println("- Проверьте, существует ли директория: " + Paths.get(FILE_PATH).getParent());
            System.err.println("- Убедитесь, что у программы есть права на запись в указанную директорию.");
            System.err.println("- Проверьте, не открыт ли файл в другой программе.");
        } catch (Exception e) {
            LOGGER.severe("Неожиданная ошибка: " + e.getMessage());
            System.err.println("Неожиданная ошибка: " + e.getMessage());
            System.err.println("Рекомендация: Проверьте корректность данных и повторите попытку.");
        }
    }
}