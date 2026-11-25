// Section 3.2 | Q375
import java.util.Scanner;

public class Question375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("- - - Password Validator - - -");

        boolean isValid = false;

        do {
            System.out.print("Enter password: ");
            String pass = sc.next();

            boolean hasDigit = false;
            int i = 0;

            // Check each character of password for at least onr digit
            while (i < pass.length()) {
                char ch = pass.charAt(i); // Extract character at index i
                if (ch >= '0' && ch <= '9') {
                    hasDigit = true; // Digit found
                }
                i++;
            }

            // Check both length and digit conditions
            if (pass.length() >= 8 && hasDigit == true) {
                isValid = true;
                System.out.println("Password accept");
            } else {
                isValid = false;
                System.out.println("Invalid. Try again.");
            }

        } while (!isValid);

        sc.close();
    }
}
