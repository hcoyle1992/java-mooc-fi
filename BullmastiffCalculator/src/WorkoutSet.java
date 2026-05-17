public class WorkoutSet {

    private int reps;
    private double weight;
    private boolean workingSet;


    public WorkoutSet(int reps, double weight, boolean workingSet) {
        this.reps = reps;
        this.weight = weight;
        this.workingSet = workingSet;
    }

    public WorkoutSet(int reps) {
        // for creating a workout template.
        // weight isn't applicable yet, and programs don't specify warmup sets anyway
        this(reps, 0, true);
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getReps() {
        return reps;
    }

    public void setWorkingSet(boolean workingSet) {
        this.workingSet = workingSet;
    }

    public boolean isWorkingSet() {
        return workingSet;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
