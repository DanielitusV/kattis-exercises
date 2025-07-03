import java.util.Scanner;

public class carrots {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int huffle = reader.nextInt();
        int problems = reader.nextInt();

        System.out.println(problems + huffle - huffle);

        reader.close();
    }
}
