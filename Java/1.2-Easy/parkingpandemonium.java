import java.util.Scanner;

public class parkingpandemonium {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int minutes = reader.nextInt();
        int temperature = reader.nextInt();
        int times = reader.nextInt();

        System.out.println(minutes * times);
    }
}
