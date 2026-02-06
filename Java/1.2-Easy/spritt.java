import java.util.Scanner;

public class spritt {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cases = reader.nextInt();
        int available = reader.nextInt();
        
        for (int i = 0; i < cases; i++) {
            int needed = reader.nextInt();
            available -= needed;
        }

        if (available >= 0) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }
        reader.close();
    }
}
