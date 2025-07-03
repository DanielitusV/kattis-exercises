import java.util.Scanner;

public class blandadbest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cases = reader.nextInt();

        if (cases > 1) {
            System.out.println("blandad best");
        } else {
            String input = reader.next();
            System.out.println(input);
        }
        reader.close();
    }
}
