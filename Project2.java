
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
}<<<<<<<HEAD=======}>>>>>>>d1d40cad9b13a8b88179773b0a542ef7d70668ec>>>>>>>243876ed 210939646619744 cf790c4fea29a3976
