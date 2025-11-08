import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFile = "input.txt";
        String encryptedFile = "encrypted.txt";
        String decryptedFile = "decrypted.txt";

        System.out.println("=== Запуск програми шифрування ===");
        System.out.println("1. Створити файл");
        System.out.println("2. Зашифрувати файл");
        System.out.println("3. Дешифрувати файл");
        System.out.println("Оберіть дію: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                FileCreator.createFile(inputFile);
                break;
            case 2:
                System.out.println("Введіть символ-ключ для шифрування: ");
                char keyEncrypt = scanner.next().charAt(0);
                EncryptionManager.encryptFile(inputFile, encryptedFile, keyEncrypt);
                break;
            case 3:
                System.out.println("Введіть символ-ключ для шифрування: ");
                char keyDecrypt = scanner.next().charAt(0);
                EncryptionManager.decryptFile(encryptedFile,decryptedFile,keyDecrypt);
                break;
            default:
                System.out.println("Невірний вибір, введіть 1,2,3!");
        }

        System.out.println("Роботу завершено.");
    }
}