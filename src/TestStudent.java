
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader input = new FileReader(args[0]);
        Scanner scan = new Scanner(input);
        ArrayList<Student> sRecord = new ArrayList<>();
        ArrayList<HomeWork> hwRecord = new ArrayList<>();

        while (scan.hasNext()) {
            String[] data = scan.next().split(":");
            // Check student
            boolean same = false;
            for (Student s : sRecord) {
                if (s.isSame(data[0])) {
                    s.Record.add(new HomeWork(data[1], data[2]));
                    same = true;
                    break;
                }
            }
            if (!same) {
                sRecord.add(new Student(data[0], data[1], data[2]));
            }
                     

            // Check homework
            boolean already = false;
            for (HomeWork h : hwRecord) {
                if (h.isAlready(data[1])) {
                    already = true;
                    break;
                }
            }
            if (!already) {
                hwRecord.add(new HomeWork(data[1]));
            }
            
        }
        // Print score table
        System.out.print("          ");
        for (HomeWork h : hwRecord) {
            System.out.print(h);
        }
        System.out.println("");
        

        // Print each student detail
        for (Student s : sRecord) {
            System.out.print(s + " ");
            for (HomeWork hw : hwRecord) {
                if (s.isSubmit(hw.getHomewrk())) {
                    s.printSubmitScore(hw.getHomewrk());
                } else {
                    System.out.print(" " + hw.getScore() + " ");
                }
            }
            System.out.println("");
        }
       
    }
}
