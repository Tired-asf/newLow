import java.util.Scanner;

public class Project3 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        float result = 0;
        System.out.println("=============SIMPLE CALCULATOR PROGRAM================");
        System.out.print("Enter the first number: ");
        float num1 = sn.nextFloat();
        System.out.print("Enter an operator (+, -, *, /,^): ");
        char ch = sn.next().charAt(0);
        System.out.print("Enter the second number: ");
        float num2 = sn.nextFloat();
        switch (ch) {
            case '+' -> {
                result = num1 + num2;
                System.out.printf("\tResult = %.2f  + %.2f = %.2f\n", num1, num2, result);
                System.out.println("This is a simple addition operation.");
                System.out.println("=============THANK YOU FOR USING THE CALCULATOR================");
            }
            case '-' -> {
                result = num1 - num2;
                System.out.printf("\tResult = %.2f  - %.2f = %.2f\n", num1, num2, result);
                System.out.println("This is a simple subtraction operation.");
                System.out.println("=============THANK YOU FOR USING THE CALCULATOR================");
            }
            case '*' -> {
                result = num1 * num2;
                System.out.printf("\tResult = %.2f  * %.2f = %.2f\n", num1, num2, result);
                System.out.println("This is a simple multiplication operation.");
                System.out.println("=============THANK YOU FOR USING THE CALCULATOR================");
            }
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("\tResult = %.2f  / %.2f = %.2f\n", num1, num2, result);
                    System.out.println("This is a simple division operation.");
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                System.out.println("=============THANK YOU FOR USING THE CALCULATOR================");
            }
            case '^' -> {

                result = (float) Math.pow(num1, num2);
                System.out.printf("\tResult = %.2f  ^ %.2f = %.2f\n", num1, num2, result);
                System.out.println("This is a simple exponentiation operation.");
                System.out.println("=============THANK YOU FOR USING THE CALCULATOR================");
            }
            default -> {
                System.out.println("\t12Invalid operator selected.");
                System.out.println("=============THANK YOU FOR USING THE CALCULATOR========");
            }
        }
        sn.close();
    }
}
