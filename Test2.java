import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        char ch = 'y';
        while (ch == 'y' || ch == 'Y') {
            System.out.print("Enter your name and roll no followed by a comma : ");
            String str = sn.nextLine();
            String[] st = str.split(",");
            if (st[0].trim().matches("[a-zA-Z]+")) {
                System.out.println("Name is valid");
            } else {
                System.out.println("Name is invalid");
            }
            System.out.println("Roll No : " + st[1]);
            System.out.print("Do you want to continue (y/n) : ");
            ch = sn.nextLine().charAt(0);

        }
        sn.close();
    }
}
