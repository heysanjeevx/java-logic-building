// Section 2.3 | Q212
import java.util.Scanner;

public class Question212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter internet data used in GB: ");
        double usage = sc.nextDouble();

        if (usage < 0) {
            System.out.println("Invalid Data Usage");
        } else if (usage < 1) {
            System.out.println("Low");
        } else if (usage < 5) {
            System.out.println("Medium");
        } else if (usage < 10) {
            System.out.println("High");
        } else {
            System.out.println("Exceeded - Extra charges apply");
        }
        
        sc.close();
    }
}
