import java.util.Scanner;

public class echoechoecho {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();

        for (int i = 0; i < 3; i++){
            if (i != 2) {
                System.out.print(input + " ");
            } else {
                System.out.print(input);
            }
        }
    }
}
