import java.io.*;
import java.util.Scanner;

public class FileCreator {
    public static void createFile (String filePath) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст для запису у файл:");
        String text = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(text);
            System.out.println("Файл успішно створено у: " + filePath);
        } catch (IOException e) {
            System.out.println("Помилка при створені файлу: " + e.getMessage());
        }
    }
}