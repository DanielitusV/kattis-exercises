import java.util.Scanner;

public class oddecho {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cases = reader.nextInt();

        for (int i = 1; i <= cases; i++) {
            String input = reader.next();
            if (i % 2 != 0) {
                System.out.println(input);
            }
        }
        reader.close();
    }
}
