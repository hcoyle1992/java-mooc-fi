
import util.ConsoleUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to workout tracker");

        while (true) {
            displayMenu();

            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 2) break;

            if (choice == 1) {
                createWorkout(scanner);
            }
        }
    }

    static void displayMenu() {
        ConsoleUI.printHeader("Choose from the following options");
        System.out.println("1. Create a new workout program.");
        System.out.println("2. Start a workout");
        System.out.println("3. Exit");
        System.out.println();
    }


    static boolean addExercises(Scanner scanner, Workout workout) {
        int exerciseNum = 1;

        while (true) {
            ConsoleUI.printHeader("Exercise " + exerciseNum + " name (or Q to Exit)");

            String exName = scanner.nextLine();

            if (exName.equalsIgnoreCase("q")) {
                return false; // stop everything
            }

            ConsoleUI.printHeader("Select primary muscles used: ");
            printMuscleGroups();

            MuscleGroup[] groups = MuscleGroup.values();
            int choice = Integer.parseInt(scanner.nextLine());
            MuscleGroup group = groups[choice - 1];

            ConsoleUI.printHeader("Number of sets: ");
            int sets = Integer.parseInt(scanner.nextLine());

            ConsoleUI.printHeader("Number of reps per set: ");
            int reps = Integer.parseInt(scanner.nextLine());

            var exercise = new Exercise(exName, group);

            for (int i = 0; i < sets; i++) {
                exercise.addSet(new WorkoutSet(reps));
            }

            workout.addExercise(exercise);

            exerciseNum++;
            System.out.println();
        }
    }


    static void createWorkout(Scanner scanner) {
        ConsoleUI.printHeader("Workout name: ");
        String workoutName = scanner.nextLine();

        ConsoleUI.printHeader("How many days per week?");
        int daysPerWeek = Integer.parseInt(scanner.nextLine());

        Workout workout = new Workout(workoutName, daysPerWeek);

        for (int i = 1; i <= daysPerWeek; i++) {
            ConsoleUI.printHeader("Day " + i);

            boolean carryOn = addExercises(scanner, workout);

            if (!carryOn) {
                break;
            }
        }

        System.out.println("Saved... View your workout plan below");
        System.out.println();

        workout.toString();
        System.out.println();

    }

    static void printMuscleGroups() {
        var muscleGroups = MuscleGroup.values();

        for (int j = 1; j <= muscleGroups.length; j++) {
            System.out.println(j + ". " + muscleGroups[j - 1]);
        }
        System.out.println();
    }
}