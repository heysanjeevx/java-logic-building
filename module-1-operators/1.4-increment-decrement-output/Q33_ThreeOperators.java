// Q33 | Section 1.4 | Three or More Operators
public class Q33_ThreeOperators {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int c = ++a * b-- + a--;
        System.out.println(c);
    }
}
