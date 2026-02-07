import java.util.Scanner;

public class hissingmicrophone {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int length = input.length();
        boolean res = false;

        for (int i = 0; i < length - 1; i++){
            if (input.charAt(i) == 's') {
                if (input.charAt(i + 1) == 's') {
                    res = true;
                }
            }
        }

        if (res) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}
