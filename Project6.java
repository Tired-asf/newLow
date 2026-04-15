import java.util.Scanner;

public class Project6 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sn.nextInt();
        System.out.print("Enter the number of columns :");
        int colmns = sn.nextInt();
        System.out.print("The pattern is : ");
        char ch = sn.next().charAt(0);
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= colmns; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        sn.close();
    }
}
