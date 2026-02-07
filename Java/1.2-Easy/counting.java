import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int value = reader.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(value * i);
        }
    }
}
