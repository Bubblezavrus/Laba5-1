import java.io.*;

public class EncryptionManager {

    public static void encryptFile(String inputPath, String outputPath, char key) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            int symbol;
            while ((symbol = reader.read()) != -1) {
                char encryptedChar = (char) (symbol + (int) key);
                writer.write(encryptedChar);
            }
            System.out.println("Файл успішно зашифровано: " + outputPath);
        } catch (IOException e) {
            System.out.println("Помилка при шифрувані: " + e.getMessage());
        }
    }

    public static void decryptFile(String inputPath, String outputPath, char key) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            int symbol;
            while ((symbol = reader.read()) != -1) {
                char decryptedChar = (char) (symbol - (int) key);
                writer.write(decryptedChar);
            }
            System.out.println("Файл успішно розшифровано: " + outputPath);

        } catch (IOException e) {
            System.out.println("Помилка при дешифрувані: " + e.getMessage());
        }
    }
}