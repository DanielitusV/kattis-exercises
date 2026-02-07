import java.util.Scanner;

public class autori {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();

        String res = getCaps(input);
        System.out.println(res);
    }

    private static String getCaps(String line) {
        StringBuilder res = new StringBuilder();
        int length = line.length();

        for (int i = 0; i < length; i++) {
            char character =  line.charAt(i);
            if (character >= 'A' && character <= 'Z') {
                res.append(character);
            }
        }
        return res.toString();
    }
}
