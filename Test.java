import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the temperature:");
        double temp = sn.nextDouble();
        System.out.println("Enter the unit (C/F):");
        String unit = sn.next().toUpperCase();
        switch (unit) {
            case "C" -> {
                double fahrenheit = (temp * 9 / 5) + 32;
                System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit\n", temp, fahrenheit);
            }
            case "F" -> {
                double celsius = (temp - 32) * 5 / 9;
                System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius\n", temp, celsius);
            }
        }
        sn.close();
    }

}
