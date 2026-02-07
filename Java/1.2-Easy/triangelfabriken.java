import java.util.Scanner;

public class triangelfabriken {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();

        if (a > 90 || b > 90 || c > 90) {
            System.out.println("Trubbig Triangel");
        } else if (a == 90 || b ==  90 || c == 90) {
            System.out.println("Ratvinklig Triangel");
        } else {
            System.out.println("Spetsig Triangel");
        }
    }
}
