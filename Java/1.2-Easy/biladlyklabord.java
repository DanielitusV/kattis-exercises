import java.util.Scanner;

public class biladlyklabord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        StringBuilder res = new StringBuilder();
        int length = input.length();
        char last = 0;

        for (int i = 0; i < length; i++) {
            char actual = input.charAt(i);
            if (last != actual) {
                res.append(actual);
                last = actual;
            }
        }

        System.out.println(res.toString());
    }
}
