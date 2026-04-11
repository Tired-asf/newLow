import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your principle : ");
        double p = sn.nextDouble();
        System.out.print("Enter your rate of interest (in %) : ");
        double r = sn.nextDouble() / 100;
        System.out.print("Enter the # of times compounded per year : ");
        double n = sn.nextDouble();
        System.out.print("Enter the # of years : ");
        double t = sn.nextDouble();
        double compoundInterest = p * Math.pow((1 + (r / n)), n * t);
        System.out.printf("Compound Interest =$%.2f\n", compoundInterest);
        sn.close();
    }
}
