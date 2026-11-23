// Section 3.1 | Q350
import java.util.Scanner;

public class Question350 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (0 to stop");
        int num = sc.nextInt();

        // Initialize counter variable
        int pCount = 0, nCount = 0, zCount = 0;

        // Run loop until user enters 0
        while (num != 0) {
            if (num > 0) {
                pCount++;
            } else if (num < 0) {
                nCount++;
            } else {
                zCount++;
            }
            num = sc.nextInt();
        }
        System.out.println("Total positive numbers: " + pCount);
        System.out.println("Total negative numbers: " + nCount);
        System.out.println("Total zero numbers: " + zCount);
    }
}
