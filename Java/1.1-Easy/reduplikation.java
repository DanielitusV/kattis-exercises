import java.util.Scanner;

public class reduplikation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int times = reader.nextInt();

        String res = buildString(input, times);
        System.out.println(res);

        reader.close();
    }

    private static String buildString(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
