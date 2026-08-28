import java.util.Scanner;

public class bokstaflega1984 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();

        if (input == 1984) {
            System.out.println("Literally 1984");
        } else {
            System.out.println("Not 1984... yet");
        }
    }
}
