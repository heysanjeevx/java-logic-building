// Section 1.4 | Q104
public class Question104 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++ + ++a + a;
        System.out.println(b); // Output: 34
    }
}
