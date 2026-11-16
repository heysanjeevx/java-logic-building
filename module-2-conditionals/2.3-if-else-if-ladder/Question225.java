// Section 2.3 | Q225
import java.util.Scanner;

public class Question225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sound level in decibels: ");
        int decibels = sc.nextInt();

        if (decibels < 0) {
            System.out.println("Invalid sound level");
        } else if (decibels < 30) {
            System.out.println("Quiet");
        } else if (decibels < 60) {
            System.out.println("Normal");
        } else if (decibels <= 85) {
            System.out.println("Loud");
        } else {
            System.out.println("Damaging to hearing");
        }

        sc.close();
    }
}
