import java.util.Scanner;

public class whichisgreater {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();

        if (a > b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
