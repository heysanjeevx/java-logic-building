// Section 2.4 | Q263
import java.util.Scanner;

public class Question263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a marks (0 to 100): ");
        int marks = sc.nextInt();

        System.out.println((marks < 0 || marks > 100) ? "Invalid marks" : (marks >= 90) ? "A" :
                (marks >= 80) ? "B" : (marks >= 70) ? "C" : "F");

        sc.close();
    }
}
