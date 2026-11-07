// Q31 | Section 1.4 | Three or More Operators
public class Q31_ThreeOperators {
    public static void main(String[] args) {
        int a = 0;
        int b = a++ + a++ + a++ + a++;
        System.out.println(b);
        System.out.println(a);  // value of a afterwards (the sheet asks for it)
    }
}
