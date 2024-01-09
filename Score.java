import java.util.ArrayList;
import java.util.List;

public class Score {
    private List<Integer> list;

    public Score() {
        this.list = new ArrayList<>();
    }

    public List<Integer> getScore() {
        return list;
    }

    public void addScore(int score) {
        this.list.add(score);
    }

    public void removeScore(int score) {
        this.list.remove(Integer.valueOf(score));
    }

    @Override
    public String toString() {
        return "Score: " + list.toString();
    }

}
