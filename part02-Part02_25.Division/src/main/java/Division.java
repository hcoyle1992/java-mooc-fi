
import java.util.Scanner;



public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers to divide");
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        division(first, second);
    }

    public static void division(int numerator, int denominator) {
        System.out.println((double) numerator / denominator);
    }
}
