import java.util.Scanner;

public class ovissa {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();

        int res = input.length();
        System.out.println(res);

        reader.close();
    }    
}
