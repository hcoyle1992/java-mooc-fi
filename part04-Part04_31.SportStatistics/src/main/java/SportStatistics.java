
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportStatistics {

    private final Scanner scan;

    public SportStatistics(Scanner scan) {
        this.scan = scan;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SportStatistics app = new SportStatistics(scan);
        app.run();
    }

    public void run() {
        List<MatchStats> matches = null;

        while (matches == null) {
            System.out.println("File:");
            String fileName = scan.nextLine();

            if (fileName.isEmpty()) {
                System.out.println("File name empty. Please try again");
                continue; //early exit
            }

            Path path = Paths.get(fileName);
            if (!Files.exists(path)) {
                System.out.println("File does not exist. Please try again.");
                continue; //early exit
            }

            matches = buildMatchStats(path);
        }

        printTotalNumberOfMatches(matches);

        System.out.print("Team: ");
        String teamSearch = scan.nextLine();

        printMatchesPlayedByTeam(teamSearch, matches);
    }

    private static void printMatchesPlayedByTeam(String teamName, List<MatchStats> matches) {
        int gamesPlayed = 0;
        int gamesWon = 0;

        for (MatchStats m : matches) {

            /*  moved logic for checking if match involves team and if they're the winner to the class
                search "Information expert" (OOP), concept from GRASP - assign methods to class with the necessary info
                also check 'bad' condition first for early exit - so everything doesn't sit inside a giant if statement */
            if (!m.involvesTeam(teamName)) {
                continue;
            }

            gamesPlayed++;

            if (m.isWinner(teamName)) {
                gamesWon++;
            }
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + gamesWon);
        System.out.println("Losses: " + (gamesPlayed - gamesWon)); //not accounting for draws yet
    }




    private static void printTotalNumberOfMatches(List<MatchStats> matches) {
        System.out.println("Total number of matches played: " + matches.size());
    }


    private static List<MatchStats> buildMatchStats(Path path) {

        try (Scanner fileScanner = new Scanner(path)) {

            List<MatchStats> matchList = new ArrayList<>();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");

                matchList.add(
                        new MatchStats(
                                parts[0],
                                parts[1],
                                Integer.parseInt(parts[2]),
                                Integer.parseInt(parts[3])
                        )
                );
            }

            return matchList;

        } catch (Exception e) {
            System.out.println("Something went wrong reading the file.");
            throw new RuntimeException(e);
        }
    }
}
