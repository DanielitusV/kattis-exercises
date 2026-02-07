import java.util.Scanner;

public class lastfactorialdigit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cases = reader.nextInt();

        for (int i = 0; i < cases; i++) {
            int factorial = reader.nextInt();
            int res = getFactorial(factorial) % 10;
            System.out.println(res);
        }
    }

    private static int  getFactorial(int value) {
        int res = 1;
        for (int i = value ; i > 0 ; i--) {
            res *= i;
        }
        return res;
    }
}
