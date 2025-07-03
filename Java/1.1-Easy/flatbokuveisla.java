import java.util.Scanner;

public class flatbokuveisla {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int pizza = reader.nextInt();
        int people = reader.nextInt();

        int res = pizza % people;
        System.out.println(res);

        reader.close();
    }
}
