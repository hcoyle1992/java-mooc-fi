
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int countOfNums = 0;
        int evenNums = 0;
        
        System.out.println("Give numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            
            sum += number;
            countOfNums++;
            
            if (number % 2 == 0){
                evenNums++;
            }
        }
        
        double average = (double) sum / countOfNums;
        int oddNums = countOfNums - evenNums;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + countOfNums);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNums);
        System.out.println("Odd: " + oddNums);

    }
}
