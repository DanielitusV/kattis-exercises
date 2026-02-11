import java.util.Scanner;

public class pobudget {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int steps = Integer.parseInt(reader.nextLine()) * 2;
        int res = 0;

        for (int i = 0; i < steps; i++) {
            try {
                int input = Integer.parseInt(reader.nextLine());
                res += input;
            } catch (NumberFormatException e) {
                //Nada
            }
        }

        if (res > 0) {
            System.out.println("Usch, vinst");
        } else if (res < 0) {
            System.out.println("Nekad");
        } else {
            System.out.println("Lagom");
        }
    }
}
