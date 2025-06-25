import java.util.Scanner;

public class skeytasaman {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String input;

        while (reader.hasNext()) {
            input = reader.nextLine();
            sb.append(input);
        }

        String res = sb.toString();
        System.out.println(res);

        reader.close();
    }
}
