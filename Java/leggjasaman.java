import java.util.Scanner;

public class leggjasaman {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int arnar = reader.nextInt();
        int hannes = reader.nextInt();

        int res = arnar + hannes;
        System.out.println(res);

        reader.close();
    }
}
