// Q39 | Section 1.4 | Complex Multi-Operator Expressions
public class Q39_ComplexExpression {
    public static void main(String[] args) {
        int x = 4, y = 5;
        int z = ++x + y-- - x++ + --y;
        System.out.println(z);
    }
}
