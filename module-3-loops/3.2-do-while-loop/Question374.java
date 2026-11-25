// Section 3.2 | Q374
import java.util.Scanner;

public class Question374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("- - - Number Guessing Game - - -");

        int attempt = 0;
        int secret = 42;
        int guess;

        do {
            System.out.print("Guess: ");
            guess = sc.nextInt();
            attempt++;

            if (guess > secret) {
                System.out.println("Too high");
            } else if (guess < secret) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct! You got it in " + attempt + " attempts!");
            }
        } while (secret != guess);

        sc.close();
    }
}
