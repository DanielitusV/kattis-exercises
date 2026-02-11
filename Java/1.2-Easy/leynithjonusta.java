import java.util.Scanner;

public class leynithjonusta {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();

        input = input.replaceAll("\\s+", "");
        System.out.println(input);
    }
}
