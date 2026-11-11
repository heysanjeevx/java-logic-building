// Section 1.2 | Q47
public class Question47 {
    public static void main(String[] args) {
        boolean a = false, b = true;
        System.out.println(a && (b = false)); // Output: false
        System.out.println(b); // Output: true
    }
}
