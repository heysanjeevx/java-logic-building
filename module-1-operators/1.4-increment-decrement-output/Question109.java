// Section 1.4 | Q109
public class Question109 {
    public static void main(String[] args) {
        int a = 1, b = 1;
        int c = a++ + b++ + ++a + ++b;
        System.out.println(c); // Output: 8
    }
}
