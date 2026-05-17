import util.ConsoleUI;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Workout {
    private String name;
    private int daysPerWeek;
    private LocalDateTime created;
    private ArrayList<Exercise> exercises;


    public Workout(String name, int daysPerWeek) {
        this.name = name;
        this.daysPerWeek = daysPerWeek;
        this.created = LocalDateTime.now();
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        if (exercise != null) {
            this.exercises.add(exercise);
        }
    }

    @Override
    public String toString() {
        ConsoleUI.printHeader("Workout name: " + this.name
                        + "\nDays per week: " + daysPerWeek);

        for (int i = 1; i <= daysPerWeek; i++) {
            ConsoleUI.printHeader("Day " + i);

            for (var ex : exercises) {
                System.out.println("Exercise: " + ex.getName()
                        + "    " + "Category: " + ex.getPrimaryMuscles());


                // FIX this abomination it's breaking stuff
                // printing after entering just 1 exercise with 3x5 scheme it prints squat 5 5 5 for days 1, 2 and 3

                // also this should prob only return a string, not print

                for (WorkoutSet set : ex.getSets()) {
                    System.out.print(set.getReps() + " ");
                }
            }

            System.out.println();
        }
        return null;
    }
}
