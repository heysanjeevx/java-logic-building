// Section 2.4 | Q265
import java.util.Scanner;

public class Question265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a traffic signal color: ");
        String color = sc.next();

        System.out.println((color.equals("red") ? "Stop" : (color.equals("yellow") ? "Slow down" :
                color.equals("green") ? "Go" : "Invalid traffic color")) );

        sc.close();
    }
}
