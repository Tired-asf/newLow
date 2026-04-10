public class Demo {
    public static void main(String[] args) {
        int a = 10;
        double b = 20.5;
        char c = 'A';
        String s = "Hello, World!";

        System.out.printf("Integer: %d\n", a);
        System.out.printf("Double: %.2f\n", b);
        System.out.printf("Character: %c\n", c);
        System.out.printf("String: %s\n", s);
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Spaces: rows - i, Stars: 2*i - 1
            for (int j = 1; j <= rows - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= (i); k++)
                System.out.print(i);
            System.out.println();
        }
    }

}
