import java.util.Scanner;

public class nsum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cases = reader.nextInt();
        int res = 0;

        for (int i = 0; i < cases; i++) {
            int value = reader.nextInt();
            res += value;
        }

        System.out.println(res);
    }
}
