import java.util.Scanner;

public class storafmaeli {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();

        boolean res = input % 10 == 0;
        if (res) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }

        reader.close();
    }
}
