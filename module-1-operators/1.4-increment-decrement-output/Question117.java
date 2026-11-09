// Section 1.4 | Q40 | Complex Multi-Operator Expressions
public class Question117 {
    public static void main(String[] args) {
        int a = 2;
        int b = a++ + ++a + a + --a + a--;
        System.out.println("a=" + a + ", b=" + b);
    }
}
