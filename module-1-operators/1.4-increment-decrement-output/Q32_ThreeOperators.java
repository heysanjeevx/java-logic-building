// Q32 | Section 1.4 | Three or More Operators
public class Q32_ThreeOperators {
    public static void main(String[] args) {
        int a = 1, b = 1;
        int c = a++ + b++ + ++a + ++b;
        System.out.println(c);
    }
}
