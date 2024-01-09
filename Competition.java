import java.util.List;

public class Competition {
    private String competitionName;
    private int competitionID;
    private String date;
    private String category;
    private List<Competitor> listOfCompetitors;
    private Score scores;

    public Competition(String competitionName, int competitionID, String date, String category, List<Competitor> listOfCompetitors, Score scores) {
        this.competitionName = competitionName;
        this.competitionID = competitionID;
        this.date = date;
        this.category = category;
        this.listOfCompetitors = listOfCompetitors;
        this.scores = scores;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }


    public Score getScores() {
        return scores;
    }

    public void setScores(Score scores) {
        this.scores = scores;
    }
}
