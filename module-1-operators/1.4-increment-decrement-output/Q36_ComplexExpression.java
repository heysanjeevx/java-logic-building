// Q36 | Section 1.4 | Complex Multi-Operator Expressions
public class Q36_ComplexExpression {
    public static void main(String[] args) {
        int a = 1;
        int b = a++ + ++a + a++ + ++a;
        System.out.println("a=" + a + ", b=" + b);
    }
}
