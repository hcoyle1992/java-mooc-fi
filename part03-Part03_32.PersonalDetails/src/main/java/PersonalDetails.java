
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> birthYears = new ArrayList<>();
        
        while (true) {
            String nameAndYear = scanner.nextLine();
            
            if (nameAndYear.equals(""))
            {
                break;
            }
            
            String[] namesAndYears = nameAndYear.split(",");
            names.add(namesAndYears[0]);
            birthYears.add(Double.valueOf(namesAndYears[1]));
        }
        
        // get the longest name
        String longestName = names.get(0);
        
        for (String name : names) { 
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        
        // get the average birth year
        Double sumOfYears = 0.0;
        
        for (Double year : birthYears) {
            sumOfYears += year;
        }
        
        Double averageBirthYear = sumOfYears / birthYears.size();
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYear);
    }
}
