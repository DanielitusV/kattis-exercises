import java.util.Scanner;

public class cosmicpathoptimization {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cases = reader.nextInt();
        int res = 0;

        for (int i = 0; i < cases; i++) {
            int input = reader.nextInt();
            res += input;
        }

        res /= cases;
        System.out.println(res);
    }
}
