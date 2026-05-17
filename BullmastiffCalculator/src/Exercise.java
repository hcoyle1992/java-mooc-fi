import java.util.ArrayList;
import java.util.List;

public class Exercise {
    private String name;    // may be final, but maybe add option to update the name in UI
    private List<WorkoutSet> sets; //etc..
    private MuscleGroup primaryMuscles;

    public Exercise(String name, MuscleGroup primaryMuscles) {
        this.name = name;
        this.primaryMuscles = primaryMuscles;
        this.sets = new ArrayList<>();//  use  List.of(primaryMuscles) when user inputs;
    }

    public String getName() {
        return name;
    }

    public MuscleGroup getPrimaryMuscles() {
        return primaryMuscles;
    }

    public void addSet(WorkoutSet set) {
        sets.add(set);
    }

    public List<WorkoutSet> getSets() {
        return this.sets;
    }
}
