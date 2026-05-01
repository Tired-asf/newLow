import java.util.Scanner;
import java.util.Random;

public class Project8 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Welcome to DICE GAME!");
        System.out.print("Enter the number of dice you wish to roll: ");
        int num = sn.nextInt();
        int sum = 0;
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                int dice = rn.nextInt(1, 7);
                displayDice(dice);
                System.out.println("Dice " + (i + 1) + ": " + dice);
                sum += dice;
            }
            System.out.println("Total sum of dice: " + sum);
        } else {
            System.out.println("Please enter a positive number of dice.");
        }
    }

    static void displayDice(int dice) {
        String dice1 = """
                ---------
                |       |
                |   *   |
                |       |
                ---------
                """;
        String dice2 = """
                ---------
                | *      |
                |        |
                |      * |
                ---------
                """;
        String dice3 = """
                ---------
                | *      |
                |   *    |
                |      * |
                ---------
                """;
        String dice4 = """
                ----------
                | *     * |
                |         |
                | *     * |
                ----------
                """;
        String dice5 = """
                ----------
                | *     * |
                |    *    |
                | *     * |
                ----------
                """;
        String dice6 = """
                ----------
                | *     * |
                | *     * |
                | *     * |
                ----------
                """;
        switch (dice) {
            case 1 -> System.out.print("You rolled a \n" + dice1);
            case 2 -> System.out.print("You rolled a \n" + dice2);
            case 3 -> System.out.print("You rolled a \n" + dice3);
            case 4 -> System.out.print("You rolled a \n" + dice4);
            case 5 -> System.out.print("You rolled a \n" + dice5);
            case 6 -> System.out.print("You rolled a \n" + dice6);
            default -> System.out.println("Invalid number of dice.");
        }
    }

}
