import java.util.Scanner;

public class qaly {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cases = reader.nextInt();
        double res = 0.0;

        for (int i = 0; i < cases; i++) {
            double quality = reader.nextDouble();
            double years = reader.nextDouble();

            res += quality * years;
        }
        System.out.printf("%.3f\n", res);
        reader.close();
    }
}
