// Q37 | Section 1.4 | Complex Multi-Operator Expressions
public class Q37_ComplexExpression {
    public static void main(String[] args) {
        int x = 3;
        int y = x++ + ++x + x++ + --x;
        System.out.println(y);
    }
}
