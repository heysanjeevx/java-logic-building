// Section 2.5 | Q299
import java.util.Scanner;

public class Question299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a programming language number (1 to 5): ");
        int num = sc.nextInt();

        switch (num) {
            case 1: System.out.println("Java"); break;
            case 2: System.out.println("Python"); break;
            case 3: System.out.println("C++"); break;
            case 4: System.out.println("JavaScript"); break;
            case 5: System.out.println("C"); break;
            default: System.out.println("Unknown language");
        }

        sc.close();
    }
}
