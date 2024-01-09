import java.util.Arrays;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Competitor {

        private int competitorNumber;
        private int age;
        private String dateOfBirth;
        private Name name;
        private String category;
        private int level;
        private String email;
        private Score scores;
        private double overallScore;
        private String competition;

        public Competitor(int competitorNumber, int age, String dateOfBirth, Name name, String category, int level, String email, Score scores, String competition) {
            this.competitorNumber = competitorNumber;
            this.age = age;
            this.dateOfBirth = dateOfBirth;
            this.name = name;
            this.category = category;
            this.level = level;
            this.email = email;
            this.scores = scores;
            this.competition = competition;
        }



        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


        public Name getName() {
            return name;
        }


        public String getCategory() {
            return category;
        }


        public void setlevel(int level) {
            this.level = level;
    }

        public int getLevel() {
            return level;
        }


        public void setScores(Score scores) {
            this.scores = scores;
    }
        public void setCompetition(String competition) {
            this.competition = competition;
        }

        public String getCompetition() {
            return competition;
        }

        public String getDateOfBirth() {
        return dateOfBirth;
    }

}




