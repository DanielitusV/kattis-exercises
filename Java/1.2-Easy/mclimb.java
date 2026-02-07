import java.util.Scanner;

public class mclimb {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int rocks = reader.nextInt();
        int cost = reader.nextInt();
        int year = reader.nextInt();

        System.out.println(rocks * cost);
    }
}
