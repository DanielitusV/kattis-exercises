import java.util.Scanner;

public class dagatal {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int month = reader.nextInt();
        int res;

        if (month == 2) {
            res = 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            res = 30;
        } else {
            res = 31;
        }

        System.out.println(res);
        reader.close();
    }
}
