import java.util.Scanner;

public class aterriblefortress {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int cases = Integer.parseInt(reader.next());
        int res = 0;

        for (int i = 0; i < cases; i++) {
            int value = Integer.parseInt(reader.next());
            res += value;
        }

        System.out.println(res);
    }
}
