// Q34 | Section 1.4 | Three or More Operators
public class Q34_ThreeOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = ++x + x++ + --x + x--;
        System.out.println("x=" + x + ", y=" + y);
    }
}
