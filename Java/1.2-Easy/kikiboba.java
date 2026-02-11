import java.util.Scanner;

public class kikiboba {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int b = 0;
        int k = 0;
        int length = input.length();

        for (int i = 0; i < length; i++) {
            char character = input.charAt(i);
            if (character == 'b') {
                b++;
            } else if (character == 'k') {
                k++;
            }
        }

        if (b > k) {
            System.out.println("boba");
        } else if (k > b) {
            System.out.println("kiki");
        } else if (k == 0) {
            System.out.println("none");
        } else {
            System.out.println("boki");
        }
    }
}
