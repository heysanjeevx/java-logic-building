// Section 2.5 | Q279

public class Question279 {
    public static void main(String[] args) {
        String day = "MONDAY";

        switch (day) {
            case "monday":
                System.out.println("Lower case match");
                break;
            case "MONDAY":
                System.out.println("Upper case match");
                break;
            default:
                System.out.println("No match");

            // Output: Upper case match
        }
    }
}
