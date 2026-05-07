
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        int count = 0;
        
        while (true) {
            String nameAndAge = scanner.nextLine();
            
            if (nameAndAge.equals("")){
                break;
            }
            
            String[] namesAndAges = nameAndAge.split(",");
            
            int age = Integer.valueOf(namesAndAges[1]);
            
            if (age > oldest){
                oldest = age; 
            }
            
            count += 1;
        }
        
        if (count > 0) {
            System.out.println("Age of the oldest: " + oldest);
        }
    }
}
