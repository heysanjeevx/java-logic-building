// Section 2.3 | Q200
import java.util.Scanner;

public class Question200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter heart rate (beats per minute): ");
        int heartRate = sc.nextInt();

        if (heartRate < 60) {
            System.out.println("Bradycardia (Too Slow)");
        } else if (heartRate <= 100) {
            System.out.println("Normal");
        } else {
            System.out.println("Tachycardia (Too Fast");
        }

        sc.close();
    }
}
