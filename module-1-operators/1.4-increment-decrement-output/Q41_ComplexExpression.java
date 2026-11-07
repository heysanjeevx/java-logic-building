// Q41 | Section 1.4 | Complex Multi-Operator Expressions
public class Q41_ComplexExpression {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4, d = 5;
        int result = --a + b++ - c-- + ++d + a++ * --b;
        System.out.println(result);
    }
}
