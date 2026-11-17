// Section 2.5 | Q277

public class Question277 {
    public static void main(String[] args) {
        int month = 4;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("31 days");

            // Output: 30 days
        }
    }
}
