import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number of seconds to count down from: ");
        int seconds = sn.nextInt();
        for (int i = seconds; i >= 0; i--) {
            System.out.println(i);
            if (i < 3) {
                System.out.println("hurry.....!");
            }
            Thread.sleep(1000); // Sleep for 1 second
        }
        System.out.println("Time's up!");
        System.out.println("Have a nice day!");

        sn.close();
    }
}
