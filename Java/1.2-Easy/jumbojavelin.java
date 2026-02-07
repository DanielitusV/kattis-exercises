import java.util.Scanner;

public class jumbojavelin {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int pieces = reader.nextInt();
        int res = 0;

        for (int i = 0; i < pieces; i++) {
            int piece = reader.nextInt();
            res += piece;
        }

        System.out.println(res - (pieces - 1));
    }
}
