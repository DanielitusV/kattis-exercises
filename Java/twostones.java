import java.util.Scanner;

public class twostones {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        String res = input % 2 == 0 ? "Bob" : "Alice";

        if (input % 2 == 0) {
            System.out.println(res);
        } else {
            System.out.println(res);
        }
        reader.close();
    }
}
