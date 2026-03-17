import java.util.Scanner;

public class grafaholur {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int nWorkers = reader.nextInt();
        int hHours = reader.nextInt();
        int xMeters = reader.nextInt();
        int mWorkers = reader.nextInt();
        int yMeters = reader.nextInt();

        double res = (double) (yMeters * nWorkers * hHours) / (mWorkers * xMeters);
        System.out.println(res);
    }
}
