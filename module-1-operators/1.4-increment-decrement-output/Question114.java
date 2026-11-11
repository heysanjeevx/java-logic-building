// Section 1.4 | Q114
public class Question114 {
    public static void main(String[] args) {
        int x = 3;
        int y = x++ + ++x + x++ + --x;
        System.out.println(y); // Output: 18
    }
}
