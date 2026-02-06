import java.util.Scanner;

public class decimaldeletion {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double number = reader.nextDouble();

        int res = (int)Math.round(number);
        System.out.println(res);
        reader.close();
    }
}
