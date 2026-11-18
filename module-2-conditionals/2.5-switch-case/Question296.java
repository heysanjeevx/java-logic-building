// Section 2.5 | Q296
import java.util.Scanner;

public class Question296 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a direction as a single uppercase character: ");
        char direction = sc.next().charAt(0);

        switch (direction) {
            case 'N': System.out.println("North"); break;
            case 'S': System.out.println("South"); break;
            case 'E': System.out.println("East"); break;
            case 'W': System.out.println("West"); break;
            default: System.out.println("Unknown direction");
        }

        sc.close();
    }
}
