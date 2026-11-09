// Section 1.4 | Q35 | Complex Multi-Operator Expressions
public class Question112 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a + a++ + --a;
        System.out.println("a=" + a + ", b=" + b);
    }
}
