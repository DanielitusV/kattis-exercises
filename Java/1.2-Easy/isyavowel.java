import java.util.Scanner;

public class isyavowel {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int length = input.length();
        int res = 0;
        int resY = 0;

        for (int i = 0 ; i < length ; i++) {
            char ch = input.charAt(i);

            if (isVowel(ch)) {
                res++;
            }
            if (isVowelPlusY(ch)) {
                resY++;
            }
        }

        System.out.println(res + " " + resY);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private static boolean isVowelPlusY (char c) {
        return isVowel(c) || c == 'y';
    }
}
