import java.util.Scanner;

public class margfoldun {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int fold1 = reader.nextInt();
        int fold2 = reader.nextInt();

        int res = fold1 * fold2;
        System.out.println(res);
    }
}
