// Q18 | Section 1.2 | Short-Circuit Evaluation
public class Q18_ShortCircuit {
    public static void main(String[] args) {
        boolean x = true, y = false;
        System.out.println(x || (y = true));
        System.out.println(y);
    }
}
