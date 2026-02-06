import java.util.Scanner;

public class bladra2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int velocity = reader.nextInt();
        int acceleration = reader.nextInt();
        int time = reader.nextInt();

        double res = velocity * time + 0.5 * acceleration * Math.pow(time, 2);
        System.out.println(res);
        reader.close();
    }
}
