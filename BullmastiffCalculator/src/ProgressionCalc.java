import java.util.Scanner;

public class ProgressionCalc {

    public void calculateNextWorkingWeight () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base reps for last working set: ");
        int baseReps = Integer.parseInt(scanner.nextLine());

        System.out.println("Using kilograms or pounds?");
        String format = scanner.nextLine();

        System.out.println("Weight used: ");
        double currentWeight = Double.parseDouble(scanner.nextLine());

        if (format.equalsIgnoreCase("kg")) {
            currentWeight *= 2.205;
        }

        System.out.println("Reps achieved: ");
        int reps = Integer.parseInt(scanner.nextLine());

        //calculate next working weight
        int extraReps = 0;
        if (reps > baseReps){
            extraReps = reps - baseReps;
        }

        double newWorkingWeight = ((currentWeight / 100) * extraReps) + currentWeight;

        System.out.println("Your new working weight is: " + ((format.equalsIgnoreCase("kg") ? newWorkingWeight / 2.205 : newWorkingWeight)));
    }
}
