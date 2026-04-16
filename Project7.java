import java.util.Scanner;

public class Project7 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int i = 1;
        while (i != 0) {
            System.out.println("*****************");
            System.out.println("Banking Program");
            System.out.println("*****************");
            System.out.print("Enter the account holder's name: ");
            String name = sn.nextLine();
            System.out.println("Account holder's name: " + name);
            System.out.print("Enter account number : ");
            String accNum = sn.nextLine();
            System.out.println("Account number : " + accNum);
            System.out.print("Enter the initial balance : ");
            double b = sn.nextDouble();
            System.out.print("1.SHOW BALANCE\n2.DEPOSIT\n3.WITHDRAW\n4.EXIT\n");
            System.out.println("********************");
            System.out.print("Enter your choice : ");
            int choice = sn.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Your balance is :" + b);
                }
                case 2 -> {
                    System.out.print("Enter the amount to deposit : ");
                    double dep = sn.nextDouble();
                    b += dep;
                    System.out.println("Your new balance is :" + b);
                }
                case 3 -> {
                    System.out.print("Enter the amount to withdraw : ");
                    double with = sn.nextDouble();
                    if (with > b) {
                        System.out.println("Insufficient balance.");
                    } else {
                        b -= with;
                        System.out.println("Your new balance is :" + b);
                    }
                }
                case 4 -> {
                    System.out.println("Thank you for using our banking program. Goodbye!");
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
            System.out.print("Do you want to continue? (1 for yes, 0 for no) : ");
            i = sn.nextInt();

        }
        sn.close();
    }
}