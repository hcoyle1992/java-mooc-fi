
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String oldestName = "";
        
        while (true) {
            String person = scanner.nextLine();
            
            if (person.equals("")) {
                break;
            }
            
            String[] nameAndAge = person.split(",");
            String name = nameAndAge[0];
            int age = Integer.parseInt(nameAndAge[1]);
            
            if (age > oldestAge) {
                oldestName = name;
            }
        }
        
        System.out.println("Name of the oldest: " + oldestName);
    }
}
