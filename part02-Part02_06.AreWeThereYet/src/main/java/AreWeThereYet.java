
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Give me a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 4){
                break;
            }
            System.out.println("You entered: " + input);
        }
        
        System.out.println("loop closed");
    }
}
