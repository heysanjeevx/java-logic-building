// Section 2.3 | Q193
import java.util.Scanner;

public class Question193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first subject marks: ");
        int first = sc.nextInt();
        System.out.print("Enter second subject marks: ");
        int second = sc.nextInt();
        System.out.print("Enter third subject marks: ");
        int third = sc.nextInt();

        double avg = ((first + second + third) / 3.0);

        if ((first >= 40 && second >= 40 && third >= 40) && (avg >= 50)) {
            System.out.println("Pass");
        } else if (first < 40 || second < 40 || third < 40) {
            System.out.println("Fail in one or more subjects");
        } else {
            System.out.println("Fail due to low average");
        }
        sc.close();
    }
}