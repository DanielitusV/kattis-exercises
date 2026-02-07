import java.util.Scanner;

public class digitswap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int value = reader.nextInt();

        int res = (value / 10) + ((value % 10) * 10);
        System.out.println(res);
    }
}
