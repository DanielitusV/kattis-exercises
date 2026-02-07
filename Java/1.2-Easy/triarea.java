import java.util.Scanner;

public class triarea {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int height = reader.nextInt();
        int base = reader.nextInt();

        double res = (double) (height * base) / 2;
        System.out.println(res);
    }
}
