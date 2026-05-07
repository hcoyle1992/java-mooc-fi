
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);
        
        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
    
        ArrayList<Integer> numbersInRange = new ArrayList<>();
        
        for(int num : numbers) {
            if (num >= lowerLimit && num <= upperLimit) {
                numbersInRange.add(num);
            }
        }
        
        System.out.println(numbersInRange);
    }
}
