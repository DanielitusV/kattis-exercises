import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int pointX = reader.nextInt();
        int pointY = reader.nextInt();
        int res;

        if (pointX > 0) {
            if (pointY > 0) {
                res = 1;
            } else {
                res = 4;
            }
        } else {
            if (pointY > 0) {
                res = 2;
            } else {
                res = 3;
            }
        }
        System.out.println(res);
        reader.close();
    }
}
