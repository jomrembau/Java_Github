import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path path = Paths.get("emails.txt");

        try (var lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}