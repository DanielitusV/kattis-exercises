import java.util.Scanner;

public class takkfyrirmig {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cases = reader.nextInt();
        String input, res;
        StringBuilder sb;
        
        for (int i = 0; i < cases; i++) {
            input = reader.next();
            sb = new StringBuilder();
            sb.append("Takk ");
            sb.append(input);
            res = sb.toString();

            System.out.println(res);
        }
        reader.close();
    }
}
