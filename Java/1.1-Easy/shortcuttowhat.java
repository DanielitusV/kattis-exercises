import java.util.Scanner;

public class shortcuttowhat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();

        int res = (input + 5) * 3 - 10;
        System.out.println(res);

        reader.close();
    } 
}
