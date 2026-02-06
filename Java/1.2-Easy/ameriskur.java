import java.util.Scanner;

public class ameriskur {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double FOOTBALL_FIELD = 0.09144;
        int ammount = reader.nextInt();

        double res = FOOTBALL_FIELD * ammount;
        System.out.println(res);

        reader.close();
    }
}
