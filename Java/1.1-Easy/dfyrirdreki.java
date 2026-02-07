import java.util.Scanner;

public class dfyrirdreki {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        int res = 0;

        if (validRoot(a, b, c, true)) {
            res++;
        }

        if (validRoot(a, b, c, false)) {
            res++;
        }

        System.out.println(res);
    }

    public static boolean validRoot(int a, int b, int c, boolean positive) {
        boolean res;
        double root;
        double sqrt = Math.sqrt(Math.pow(b,2) - 4 * a * c);

        if (Double.isNaN(sqrt)) {
            res = false;
        } else {
            if (positive) {
                root = -b + sqrt;
            } else {
                root = -b - sqrt;
                if (sqrt == 0) {
                    return false;
                }
            }
            res = !Double.isNaN(root);
        }
        return res;
    }
}
