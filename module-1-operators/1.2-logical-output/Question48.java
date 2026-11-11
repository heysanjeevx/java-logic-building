// Section 1.2 | Q48
public class Question48 {
    public static void main(String[] args) {
        boolean x = true, y = false;
        System.out.println(x || (y = true)); // Output: true
        System.out.println(y); // Output: false
    }
}
