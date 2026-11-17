// Section 2.4 | Q268
import java.util.Scanner;

public class Question268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        String result = (s1.length() > s2.length()) ? s1 :
                        (s1.length() < s2.length()) ? s2 : "Equal length";
        System.out.println(result);

        sc.close();
    }
}
