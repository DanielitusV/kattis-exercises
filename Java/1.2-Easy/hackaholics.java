import java.util.Scanner;

public class hackaholics {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int students = reader.nextInt();
        int money = reader.nextInt();
        int prizes = reader.nextInt();

        System.out.println(students * prizes);
    }
}
