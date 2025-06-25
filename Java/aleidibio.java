import java.util.Scanner;

public class aleidibio {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int arnar = reader.nextInt();
        int cinema = reader.nextInt();
        int movieStart = reader.nextInt();

        int timeElapsed = arnar + cinema;
        int res = movieStart - timeElapsed;
        System.out.println(res);

        reader.close();
    }
}
