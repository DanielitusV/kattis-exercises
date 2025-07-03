import java.util.Scanner;

public class telja {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();

        for (int i = 1; i <= input; i++) {
            System.out.println(i);
        }

        reader.close();
    }
}
