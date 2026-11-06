/**
 * Tiny helper for the "predict the output" questions.
 * You write your PREDICTION (from paper) and the expression from the sheet;
 * this prints OK / WRONG. Comparison is done on the printed text, so
 * 3 vs 3.0 or 97 vs 'a' counts as WRONG - exactly like System.out.println would show.
 */
public class Check {
    private static int total = 0;
    private static int wrong = 0;

    public static void that(int q, Object predicted, Object actual) {
        total++;
        if (String.valueOf(predicted).equals(String.valueOf(actual))) {
            System.out.println("Q" + q + " OK     -> " + actual);
        } else {
            wrong++;
            System.out.println("Q" + q + " WRONG  | predicted: " + predicted
                    + " | actual: " + actual + "   <- mistakes-log.md mein likho");
        }
    }

    public static void summary() {
        System.out.println("-----");
        System.out.println("Checked: " + total + " | Wrong: " + wrong);
    }
}
