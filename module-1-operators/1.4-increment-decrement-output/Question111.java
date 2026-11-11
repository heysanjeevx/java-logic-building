// Section 1.4 | Q111
public class Question111 {
    public static void main(String[] args) {
        int x = 5;
        int y = ++x + x++ + --x + x--;
        System.out.println("x=" + x + "y=" + y); // Output: x=5 y=24
    }
}
