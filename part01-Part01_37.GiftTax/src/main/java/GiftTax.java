
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        int baseTax;
        int taxLimit = 5000;
        
        double taxRate;
        double giftTax;
        double floorAmt;
        
        double[] band1 = { 5000, 25000 };
        double[] band2 = { 25000, 55000 };
        double[] band3 = { 55000, 200000 };
        double[] band4 = { 200000, 1000000 };
        double band5 = 1000000;
        
        String msg = "Tax: ";
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double giftVal = Double.valueOf(scan.nextLine());
        
        if (giftVal >= taxLimit) {
            if (giftVal <= band1[1]) {
                baseTax = 100;
                taxRate = 0.08;
                floorAmt = band1[0];
            } else if (giftVal <= band2[1]) {
                baseTax = 1700;
                taxRate = 0.10;
                floorAmt = band2[0];
            } else if (giftVal <= band3[1]) {
                baseTax = 4700;
                taxRate = 0.12;
                floorAmt = band3[0];
            } else if (giftVal <= band4[1]) {
                baseTax = 22100;
                taxRate = 0.15;
                floorAmt = band4[0];
            } else {
                baseTax = 142100;
                taxRate = 0.17;
                floorAmt = band5;
            }

            giftTax = calculateTax(baseTax, floorAmt, giftVal, taxRate );
            System.out.println(msg + giftTax);
        } else {
            System.out.println("No tax!");
        }
    }
    
    public static double calculateTax(int baseTax, double floorAmt, double giftVal, double taxRate){
        double giftTax = baseTax + (giftVal - floorAmt) * taxRate;
        
        return giftTax;
    }
}
