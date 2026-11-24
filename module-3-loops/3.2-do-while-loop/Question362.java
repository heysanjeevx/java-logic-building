// Section 3.2 | Q362

public class Question362 {
    public static void main(String[] args) {
        int n = 1234, rev = 0;
        do {
            rev = rev * 10 + n % 10;
            n = n / 10;
        } while (n > 0);
        System.out.println(rev); // Output: 4321
    }
}
