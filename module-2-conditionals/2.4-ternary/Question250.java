// Section 2.4 | Q250
import java.util.Scanner;

public class Question250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a marks (0 to 100): ");
        int marks = sc.nextInt();

        System.out.println(marks >= 40 ? "Pass" : "Fail");

        sc.close();
    }
}
