import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFile = "input.txt";
        String encryptedFile = "encrypted.txt";
        String decryptedFile = "decrypted.txt";

        System.out.println("=== Запуск програми шифрування ===");

        boolean running = true;
        while (running) {
            System.out.println("\n1. Створити файл");
            System.out.println("2. Зашифрувати файл");
            System.out.println("3. Дешифрувати файл");
            System.out.println("4. Вийти");
            System.out.print("Оберіть дію: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    FileCreator.createFile(inputFile);
                    FileViewer.printFileContent(inputFile, "Вміст створеного файлу:");
                    break;

                case 2:
                    System.out.print("Введіть символ-ключ для шифрування: ");
                    char keyEncrypt = scanner.next().charAt(0);
                    EncryptionManager.encryptFile(inputFile, encryptedFile, keyEncrypt);
                    FileViewer.printFileContent(encryptedFile, "Зашифрований вміст:");
                    break;

                case 3:
                    System.out.print("Введіть символ-ключ для дешифрування: ");
                    char keyDecrypt = scanner.next().charAt(0);
                    EncryptionManager.decryptFile(encryptedFile, decryptedFile, keyDecrypt);
                    FileViewer.printFileContent(decryptedFile, "Розшифрований вміст:");
                    break;

                case 4:
                    running = false;
                    System.out.println("Програму завершено.");
                    break;

                default:
                    System.out.println("Невірний вибір, введіть 1–4!");
            }
        }
    }
}
