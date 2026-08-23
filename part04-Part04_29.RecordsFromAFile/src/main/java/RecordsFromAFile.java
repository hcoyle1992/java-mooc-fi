
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        if (fileName.isEmpty()) {
            System.out.println("File name cannot be empty.");
            return;
        }

        Path path = Paths.get(fileName);
        if (!Files.exists(path)) {
            System.out.println("A file with this name doesn't exist.");
            return;
        }

        try (Scanner fileScanner = new Scanner(path)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                System.out.println(name + "," + age + (age > 1 || age == 0 ? " years" : " year"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
