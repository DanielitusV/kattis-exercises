import java.util.Scanner;

public class bijele {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8};
        int length = chess.length;

        for (int i = 0; i < length; i++) {
            int input = reader.nextInt();
            chess[i] -= input;
        }

        String res = chessToString(chess);
        System.out.println(res);
        reader.close();
    }

    private static String chessToString(int[] chess) {
        StringBuilder sb = new StringBuilder();
        int length = chess.length;

        for (int i = 0; i < length; i++) {
            sb.append(chess[i]);
            sb.append(' ');
        }

        return sb.toString().trim();
    }
}
