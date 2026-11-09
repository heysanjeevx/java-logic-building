// Section 1.2 | Q17 | Short-Circuit Evaluation
public class Question047 {
    public static void main(String[] args) {
        boolean a = false, b = true;
        System.out.println(a && (b = false));
        System.out.println(b);
    }
}
