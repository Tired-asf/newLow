import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String n;
        char f;
        double s;
        int a;
        System.out.print("Enter your name: ");
        n = sn.next();
        f = n.charAt(0);
        System.out.println("Enter your age and salary: ");
        a = sn.nextInt();
        s = sn.nextDouble();
        System.out.printf("Your name = %s\n", n);
        System.out.printf("First character of your name = %c\n", f);
        System.out.printf("Your age = %d\n", a);
        System.out.printf("Your salary = %.3f\n", s);
    }
}
