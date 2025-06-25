import java.util.Scanner;

public class fifa {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int YEAR_START = 2022;
        int improvements = reader.nextInt();
        int imprPerYear = reader.nextInt();


        int res = improvements / imprPerYear + YEAR_START;
        System.out.println(res);

        reader.close();
    }
}
