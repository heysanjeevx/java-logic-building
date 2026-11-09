// Section 1.2 | Q18 | Short-Circuit Evaluation
public class Question048 {
    public static void main(String[] args) {
        boolean x = true, y = false;
        System.out.println(x || (y = true));
        System.out.println(y);
    }
}
