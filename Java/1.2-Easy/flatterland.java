import java.util.Scanner;

public class flatterland {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int people = reader.nextInt();
        int distance = reader.nextInt();

        System.out.println((people - 1) * distance);
    }
}
