
public class HomeWork {

    // Field
    private String HwName;
    private String score = "-";

    // Constructor 
    public HomeWork(String name, String score) {
        this.HwName = name;
        this.score = score;
    }

    public HomeWork(String name) {
        HwName = name;
    }

    // Method
    public boolean isAlready(String hwName) {
        return this.HwName.equals(hwName);
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getHomewrk() {
        return this.HwName;
    }

    public String getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        System.out.print(this.HwName + " ");
        return "";
    }
}
