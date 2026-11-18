// Section 2.5 | Q300
import java.util.Scanner;

public class Question300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a coffee size character: ");
        char size = sc.next().charAt(0);

        switch (size) {
            case 'S': System.out.println("Small - 250ml"); break;
            case 'M': System.out.println("Medium - 350ml"); break;
            case 'L': System.out.println("Large - 500ml"); break;
            case 'X': System.out.println("Extra Large - 600ml"); break;
            default: System.out.println("Invalid size");
        }

        sc.close();
    }
}
