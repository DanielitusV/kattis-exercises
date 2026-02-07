import java.util.Scanner;

public class vidsnuningur {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();

        String reverse = reverseString(input);
        System.out.println(reverse);

        reader.close();
    }
    
    private static String reverseString(String string) {
        StringBuilder reversed = new StringBuilder(string);
        return reversed.reverse().toString();
    }
}
