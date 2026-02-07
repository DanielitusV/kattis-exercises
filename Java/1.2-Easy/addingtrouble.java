import java.util.Scanner;

public class addingtrouble {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();

        boolean res = checkSum(a, b, c);
        if (res) {
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }
    }

    public static boolean checkSum(int a, int b, int c) {
        return c == (a + b);
    }
}
