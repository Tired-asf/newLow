import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        System.out.println("=============WEIGHT CONVERSION PROGRAM================");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.print("Choose your option : ");
        Scanner sn = new Scanner(System.in);
        int option = sn.nextInt();
        switch (option) {
            case 1:
                System.out.print("Enter weight in Kilograms : ");
                double kg = sn.nextDouble();
                double pounds = kg * 2.20462;
                System.out.printf("%.2f Kilograms is equal to %.2f Pounds\n", kg, pounds);
                break;
            case 2:
                System.out.print("Enter weight in Pounds : ");
                double lb = sn.nextDouble();
                double kilograms = lb / 2.20462;
                System.out.printf("%.2f Pounds is equal to %.2f Kilograms\n", lb, kilograms);
                break;
            default:
                System.out.println("Invalid option selected.");
        }
        sn.close();
    }
}
