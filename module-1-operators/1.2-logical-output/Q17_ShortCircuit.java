// Q17 | Section 1.2 | Short-Circuit Evaluation
public class Q17_ShortCircuit {
    public static void main(String[] args) {
        boolean a = false, b = true;
        System.out.println(a && (b = false));
        System.out.println(b);
    }
}
