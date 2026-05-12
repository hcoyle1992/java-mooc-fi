
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statistics = new Statistics();
        Statistics evenNums = new Statistics();
        Statistics oddNums = new Statistics();

        while (true) {
            System.out.println("Enter numbers: ");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                break;
            }

            statistics.addNumber(number);

            if (number % 2 == 0) {
                evenNums.addNumber(number);
            } else {
                oddNums.addNumber(number);
            }
        }

        int sumOfAll = statistics.sum();
        int sumOfEven = evenNums.sum();
        int sumOfOdd = oddNums.sum();

        System.out.println("Sum: " + sumOfAll);
        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Sum of odd numbers: " + sumOfOdd);
        System.out.println("Average of all numbers: " + statistics.average());
    }
}
