// Section 2.5 | Q281

public class Question281 {
    public static void main(String[] args) {
        int choice = 2;
        int a = 10, b = 5;
        int result = 0;

        switch (choice) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
        }
        System.out.println(result); // Output: result = a - b => result = 10 - 5 => result = 5
    }
}
