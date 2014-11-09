
import java.util.ArrayList;

public class Student {

    // Field
    private String id;
    ArrayList<HomeWork> Record = new ArrayList<>();

    // Constructor
    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String hw, String score) {
        this.id = id;
        Record.add(new HomeWork(hw, score));
    }

    // Medthod
    public boolean isSame(String id) {
        return this.id.equals(id);
    }

    public boolean isSubmit(String hwName) {
        for (HomeWork h : Record) {
            if (h.getHomewrk().equals(hwName)) {
                return true;
            }
        }
        return false;
    }

    public void printSubmitScore(String hwName) {
        for (HomeWork h : Record) {
            if (h.getHomewrk().equals(hwName)) {
                System.out.printf(" %2d ", Integer.parseInt(h.getScore()));
                break;
            }
        }
    }

    @Override
    public String toString() {

        System.out.print(this.id);
        return "";
    }
}
