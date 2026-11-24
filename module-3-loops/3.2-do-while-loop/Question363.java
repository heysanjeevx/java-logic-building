// Section 3.2 | Q363

public class Question363 {
    public static void main(String[] args) {
        int n = 256, largest = 0;
        do {
            int digit = n % 10;
            if (digit > largest) largest = digit;
            n = n / 10;
        } while (n > 0);
        System.out.println(largest); // Output: 6
    }
}
