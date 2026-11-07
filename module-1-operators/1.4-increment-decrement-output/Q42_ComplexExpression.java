// Q42 | Section 1.4 | Complex Multi-Operator Expressions
public class Q42_ComplexExpression {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;
        int result = a++ + b++ + c++ + d++ + --a + --b + --c + --d;
        System.out.println(result);
    }
}
