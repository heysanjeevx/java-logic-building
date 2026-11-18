// Section 2.5 | Q306
import java.util.Scanner;

public class Question306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1 to 7): ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Working day");
                break;
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("invalid day");
        }
        sc.close();
    }
}
