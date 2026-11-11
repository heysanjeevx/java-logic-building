// Section 1.4 | Q118
public class Question118 {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4, d = 5;
        int result = --a + b++ - c-- + ++d + a++ * --b;
        System.out.println(result); // Output: 9
    }
}
