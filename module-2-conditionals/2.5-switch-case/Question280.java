// Section 2.5 | Q280

public class Question280 {
    public static void main(String[] args) {
        int x = 2;

        switch (x) {
            case 1:
            case 2:
            case 3:
                System.out.println("Small");
                break;
            case 4:
            case 5:
                System.out.println("Medium");
                break;
            default:
                System.out.println("Large");

            // Output: Small
        }
    }
}
