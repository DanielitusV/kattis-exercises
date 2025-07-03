import java.util.Scanner;

public class jackolanternjuxtaposition {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int eyes = reader.nextInt();
        int noses = reader.nextInt();
        int mouths = reader.nextInt();

        int res = eyes * noses * mouths;
        System.out.println(res);
        reader.close();
    }
}
