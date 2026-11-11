// Section 1.4 | Q113
public class Question113 {
    public static void main(String[] args) {
        int a = 1;
        int b = a++ + ++a + a++ + ++a;
        System.out.println("a=" + a + ", b=" + b); // a=5, b=12
    }
}
