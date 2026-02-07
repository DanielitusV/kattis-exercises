import java.util.Scanner;

public class ofugsnuid {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cases = reader.nextInt();
        int[] values = new int[cases];

        for (int i = 0; i < cases; i++) {
            int value = reader.nextInt();
            values[i] = value;
        }

        for (int i = cases - 1; i >= 0; i--) {
            System.out.println(values[i]);
        }
    }
}
