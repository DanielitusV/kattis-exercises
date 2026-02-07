import java.util.Scanner;

public class popcount {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int length = input.length();
        int res = 0;

        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == '1') {
                res++;
            }
        }
        System.out.println(res);
    }
}
