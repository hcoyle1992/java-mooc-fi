
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());

        //check that the file exists
        Path path = Paths.get(file);

        if (!Files.exists(path)) {
            System.out.println("A file with that name doesn't exist.");
            return;
        }

        ArrayList<String> listOfNums = readFileContents(file);

        int numberCount = 0;

        for (String number : listOfNums) {
            if (Integer.parseInt(number) >= lowerBound && Integer.parseInt(number) <= upperBound) {
                numberCount ++;
            }
        }

        System.out.println("Numbers: " + numberCount);


    }

    public static ArrayList<String> readFileContents(String fileName) {
        ArrayList<String> fileContents = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                fileContents.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return fileContents;
    }
}
