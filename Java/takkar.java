import java.util.Scanner;

public class takkar {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int trump = reader.nextInt();
        int kim = reader.nextInt();

        if (trump < kim) {
            System.out.println("FAKE NEWS!");
        } else if (trump > kim) {
            System.out.println("MAGA!");
        } else {
            System.out.println("WORLD WAR 3!");    
        }

        reader.close();
    }
}
