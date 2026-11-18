// Section 2.5 | Q303
import java.util.Scanner;

public class Question303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a roman numeral for a single digit (1 to 9): ");
        int digit = sc.nextInt();

        switch (digit) {
            case 1: System.out.println("I"); break;
            case 2: System.out.println("II"); break;
            case 3: System.out.println("III"); break;
            case 4: System.out.println("IV"); break;
            case 5: System.out.println("V"); break;
            case 6: System.out.println("VI"); break;
            case 7: System.out.println("VII"); break;
            case 8: System.out.println("VIII"); break;
            case 9: System.out.println("IX"); break;
            default: System.out.println("Invalid Digit");
        }

        sc.close();
    }
}
