import java.util.Objects;

public class MatchStats {

    private final String homeTeam;
    private final String awayTeam;
    private final int homeScore;
    private final int awayScore;

    public MatchStats(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public boolean involvesTeam(String teamName) {
        return Objects.equals(this.homeTeam, teamName) || Objects.equals(this.awayTeam, teamName);
    }

    public boolean isWinner(String teamName) {
        if (Objects.equals(this.homeTeam, teamName)) {
            return this.homeScore > this.awayScore;
        }

        if (Objects.equals(this.awayTeam, teamName)) {
            return this.awayScore > this.homeScore;
        }

        return false;
    }

    public boolean isDraw() {
        return homeScore == awayScore;
    }


}
