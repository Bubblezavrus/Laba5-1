import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileViewer {

    public static void printFileContent(String filename, String message) {
        System.out.println("\n" + message);
        try {
            String content = new String(Files.readAllBytes(Paths.get(filename)));
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Не вдалося прочитати файл: " + filename);
        }
    }
}
