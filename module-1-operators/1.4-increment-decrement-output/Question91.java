// Section 1.4 | Q91
public class Question91 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        int c = ++b;
        System.out.println(a + " " + b + " " + c); // Output: 6 6 6
    }
}
