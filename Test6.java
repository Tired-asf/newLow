import java.util.Arrays;

public class Test6 {
    public static void main(String args[]) {
        String[] s = { "apple", "orange", "kiwi", "jackfruit", "banana", "grape" };
        System.out.println("Original array: ");
        for (String m : s) {
            System.out.print(m + " ");
        }
        // Arrays.sort(s);
        // System.out.println("\nSorted array: ");
        for (String m : s) {
            // System.out.print(m + " ");
        }
        Arrays.fill(s, "appykundi");
        System.out.println("\nFilled array: ");
        for (String m : s) {
            System.out.print(m + " ");
        }
    }
}
