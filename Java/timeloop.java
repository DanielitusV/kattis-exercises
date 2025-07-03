import java.util.Scanner;

public class timeloop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();

        for (int i = 1; i <= input; i++) {
            String res = abracaString(i);
            System.out.println(res);
        }
        reader.close();
    }

    private static String abracaString(int index) {
        StringBuilder sb = new StringBuilder();
        sb.append(index);
        sb.append(" Abracadabra");
        return sb.toString();
    }
}
