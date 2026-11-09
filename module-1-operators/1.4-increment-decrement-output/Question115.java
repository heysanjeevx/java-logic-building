// Section 1.4 | Q38 | Complex Multi-Operator Expressions
public class Question115 {
    public static void main(String[] args) {
        int a = 2;
        int b = --a + a++ + ++a + a--;
        System.out.println(b);
    }
}
