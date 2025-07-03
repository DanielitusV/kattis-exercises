import java.util.Scanner;

public class goggi {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine().replaceAll(" ", "");
        String[] split = input.split("\\?");
        int num1 = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[1]);

        if (num1 > num2) {
            System.out.println('>');
        } else if (num1 < num2) {
            System.out.println('<');
        } else {
            System.out.println("Goggi svangur!");
        }

        reader.close();
    }
}
