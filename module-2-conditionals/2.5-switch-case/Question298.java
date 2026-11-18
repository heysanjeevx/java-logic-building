// Section 2.5 | Q298
import java.util.Scanner;

public class Question298 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an operating system number (1 to 5): ");
        int num = sc.nextInt();

        switch (num) {
            case 1: System.out.println("Windows"); break;
            case 2: System.out.println("macOS"); break;
            case 3: System.out.println("Linux"); break;
            case 4: System.out.println("Android"); break;
            case 5: System.out.println("iOS"); break;
            default: System.out.println("Unknown OS");
        }

        sc.close();
    }
}
