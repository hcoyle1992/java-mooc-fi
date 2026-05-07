

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
        printFromNumberToOne(2);
    }

    public static void printFromNumberToOne(int number) {
        
        int numberToPrint = number;
        
        while (numberToPrint >= 1) {
            System.out.println(numberToPrint);
            numberToPrint--;
        }
    }
}
