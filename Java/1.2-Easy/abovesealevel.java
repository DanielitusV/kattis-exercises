import java.util.Scanner;

public class abovesealevel {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double value = reader.nextDouble();

        double res = value - 0.3;
        System.out.println(res);
    }
}
