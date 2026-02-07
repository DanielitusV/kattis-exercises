import java.util.Scanner;

public class classphoto {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int width = reader.nextInt();
        int length = reader.nextInt();

        System.out.println(width * length);
    }
}
