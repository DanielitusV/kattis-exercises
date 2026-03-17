import java.util.Scanner;

public class wakeupcall {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first = reader.nextInt();
        int second = reader.nextInt();
        int sum = 0;


        for (int i = 0; i < first; i++) {
            sum += reader.nextInt();
        }

        for (int i = 0; i < second; i++) {
            sum -= reader.nextInt();
        }

        if (sum > 0) {
            System.out.println("Button 1");
        } else if (sum < 0) {
            System.out.println("Button 2");
        } else {
            System.out.println("Oh no");
        }
    }
}
