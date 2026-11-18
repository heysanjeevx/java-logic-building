// Section 2.5 | Q305
import java.util.Scanner;

public class Question305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a vehicle fuel type code (1 to 4): ");
        int fuelCode = sc.nextInt();

        switch (fuelCode) {
            case 1:
                System.out.println("Petrol");
                break;
            case 2:
                System.out.println("Diesel");
                break;
            case 3:
                System.out.println("CNG");
                break;
            case 4:
                System.out.println("Electric");
                break;
            default:
                System.out.println("Invalid fuel type code");
        }

        sc.close();
    }
}
