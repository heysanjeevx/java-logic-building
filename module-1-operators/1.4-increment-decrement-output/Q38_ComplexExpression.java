// Q38 | Section 1.4 | Complex Multi-Operator Expressions
public class Q38_ComplexExpression {
    public static void main(String[] args) {
        int a = 2;
        int b = --a + a++ + ++a + a--;
        System.out.println(b);
    }
}
