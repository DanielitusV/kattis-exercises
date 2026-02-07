import java.util.Scanner;

public class sorttwonumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a =  reader.nextInt();
        int b = reader.nextInt();

        if (a < b) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(b + " " + a);
        }
    }
}
