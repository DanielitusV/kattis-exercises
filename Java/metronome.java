import java.util.Scanner;

public class metronome {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double DIVISOR = 4.0;
        int input = reader.nextInt();

        double res = input / DIVISOR;
        System.out.println(res);
        
        reader.close();
    }
}
