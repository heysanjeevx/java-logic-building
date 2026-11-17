// Section 2.4 | Q243
import java.util.Scanner;

public class Question243 {
    public static void main(String[] args) {

        int marks = 85;
        String grade = marks >= 90 ? "A" : marks >= 80 ? "B" : marks >= 70 ? "C" : "F";

        System.out.println(grade); // Output: B
    }
}
