import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Random rand = new Random();
        int r = rand.nextInt(100) + 1;
        char ch;
        int guess = 0;
        int i = 1;
        while (i != 0) {
            System.out.println("Welcome to my number GUESSING GAME!!!");
            do {
                System.out.print("Enter your guess (1-100): ");
                guess = sn.nextInt();
                if (guess < r) {
                    System.out.println("Too low! Try again.");
                } else if (guess > r) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                }
            } while (guess != r);
            System.out.print("Do you wish to continue (y/n)?");
            ch = sn.next().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                r = rand.nextInt(100) + 1;
            } else {
                i = 0;
            }
        }
        sn.close();

    }
}
