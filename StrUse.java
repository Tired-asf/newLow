import java.util.Scanner;

public class StrUse {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        char ch = 'y';
        while (ch == 'y' || ch == 'Y') {
            System.out.print("Enter your name and roll no seperated by a comma : ");
            String str = sn.nextLine();
            String[] arr = str.split(",");
            if (arr[0].matches("[a-zA-Z]")) {
                System.out.println("Name is valid");
            } else {
                System.out.println("Name is invalid");
            }
            System.out.println("Roll No : " + arr[1]);
            System.out.print("Do you want to continue (y/n) : ");
            ch = sn.nextLine().charAt(0);
        }
        sn.close();
    }

}=======
import java.util.Scanner;

public class StrUse {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        char ch = 'y';
        while (ch == 'y' || ch == 'Y') {
            System.out.print("Enter your name and roll no seperated by a comma : ");
            String str = sn.nextLine();
            String[] arr = str.split(",");
            if (arr[0].matches("[a-zA-Z]")) {
                System.out.println("Name is valid");
            } else {
                System.out.println("Name is invalid");
            }
            System.out.println("Roll No : " + arr[1]);
            System.out.print("Do you want to continue (y/n) : ");
            ch = sn.nextLine().charAt(0);
        }
        sn.close();
    }

}>>>>>>>d1d40cad9b13a8b88179773b0a542ef7d70668ec
