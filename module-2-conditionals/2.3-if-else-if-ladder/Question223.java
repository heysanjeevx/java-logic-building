// Section 2.3 | Q223
import java.util.Scanner;

public class Question223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter finishing rank in a competition: ");
        int rank = sc.nextInt();

        if (rank < 1) {
            System.out.println("Invalid Rank");
        } else if (rank == 1) {
            System.out.println("Gold Medal");
        } else if (rank == 2) {
            System.out.println("Silver Medal");
        } else if (rank == 3) {
            System.out.println("Bronze Medal");
        } else {
            System.out.println("Certificate of Participation");
        }

        sc.close();
    }
}
