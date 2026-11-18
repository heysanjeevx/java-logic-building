// Section 2.5 | Q304
import java.util.Scanner;

public class Question304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a star rating (1 to 5): ");
        int stars = sc.nextInt();

        switch (stars) {
            case 5:
                System.out.println("Excellent - Thank you for your love!");
                break;
            case 4:
                System.out.println("Good - We appreciate your feedback.");
                break;
            case 3:
                System.out.println("Average - We will try to do better.");
                break;
            case 2:
                System.out.println("Bad - We are sorry for your experience.");
                break;
            case 1:
                System.out.println("Terrible - We sincerely apologize.");
                break;
            default:
                System.out.println("Invalid rating");
        }

        sc.close();
    }
}
