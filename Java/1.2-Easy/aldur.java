import java.util.Scanner;

public class aldur {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int minimum = Integer.MAX_VALUE;
        int friends = reader.nextInt();

        for (int i = 0; i < friends; i++) {
            int input = reader.nextInt();
            if (input < minimum) {
                minimum = input;
            }
        }

        System.out.println(minimum);
        reader.close();
    }
}