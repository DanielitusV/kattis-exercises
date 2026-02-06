import java.util.Scanner;

public class dragafra {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int windows = reader.nextInt();
        int curtains = reader.nextInt();

        int res = windows - curtains;
        System.out.println(res);

        reader.close();
    }
}
