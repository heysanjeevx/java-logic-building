// Section 3.1 | Q360

public class Question360 {
    public static void main(String[] args) {

        // Edge case: what happens for n = 0?
        int n = 0;
        int count = 0;
        do {
            count++;
            n = n / 10;
        } while (n > 0);
        System.out.println(count); // Output: 1
    }
}
