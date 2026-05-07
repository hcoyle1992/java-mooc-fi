
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double positiveNumTotal = 0;
        int count = 0;
        
        while (true) {
            double input = Double.valueOf(scanner.nextLine());

            if (input == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            
            if (input < 0) {
                continue;
            }
            
            count += 1;
            positiveNumTotal += input;
        }
        
        if (positiveNumTotal != 0){
            System.out.println(positiveNumTotal / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
       
    }
}
