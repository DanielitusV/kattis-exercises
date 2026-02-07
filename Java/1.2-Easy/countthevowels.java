import java.util.Scanner;

public class countthevowels {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int length = input.length();
        int res = 0;

        for (int i = 0; i < length; i++){
            char character = input.charAt(i);
            boolean isVowel = checkVowel(character);
            if (isVowel) {
                res++;
            }
        }

        System.out.println(res);
    }

    public static boolean checkVowel(char c){
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ;
    }
}
