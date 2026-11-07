// Q27 | Section 1.4 | Three or More Operators
public class Q27_ThreeOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = a++ + ++a + a;
        System.out.println(b);
    }
}
