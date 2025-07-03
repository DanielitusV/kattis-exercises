import java.util.Scanner;

public class hipphipphurra {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        int cases = reader.nextInt();
        
        String res = "Hipp hipp hurra, ";
        StringBuilder sb = new StringBuilder();
        
        sb.append(res);
        sb.append(name);
        sb.append("!");

        res = sb.toString();
        for (int i = 0; i < cases; i++) {
            System.out.println(res);
        }

        reader.close();
    }
}
