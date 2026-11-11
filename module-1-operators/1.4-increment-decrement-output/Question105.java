// Section 1.4 | Q105
public class Question105 {
    public static void main(String[] args) {
        int x = 3;
        x = x++ + ++x;
        System.out.println(x); // Output: 8
    }
}
