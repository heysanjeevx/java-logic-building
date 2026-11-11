// Section 1.4 | Q112
public class Question112 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a + a++  + --a;
        System.out.println("a=" + a + ", b=" + b); // Output: a=7, b=26
    }
}
