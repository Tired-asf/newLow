import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("**************USER NAME VALIDATION PROGRAM**************");
        System.out.print("Enter your username: ");
        String un = sn.nextLine();
        if (un.length() >= 5 && un.length() <= 15) {
            if (un.matches("^[a-zA-Z0-9(!@_^)]+$")) {
                System.out.println("Valid username.");
            } else {
                System.out
                        .println("Invalid username. Only letters, digits, and special characters (!@_^) are allowed.");
            }
        } else {
            System.out.println("Invalid username. Length must be between 5 and 15 characters.");
        }
        sn.close();
    }
}
