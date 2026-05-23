
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = readFile(file);

        if (list == null) {
            System.out.println("Reading the file " + file + " failed.");
            return;
        }

        System.out.println();


        while (true) {
            System.out.println("Search for:");

            // if no more lines in file, break
            if (!scanner.hasNextLine()) {
                break;
            }

            String searchedFor = scanner.nextLine();

            // if user enters empty string, break
            if (searchedFor.isEmpty()) {
                break;
            }

            if (list.contains(searchedFor)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }

            System.out.println();
        }
    }

    public static ArrayList<String> readFile(String file) {
        ArrayList<String> list = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                list.add(fileScanner.nextLine());
            }
        } catch (Exception e) {
            return null;
        }
        return list;
    }
}
