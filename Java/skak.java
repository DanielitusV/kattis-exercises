import java.util.Scanner;

public class skak {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] petraRook = new int[2];
        int[] gardarPawn = new int[2];
        int res = 0;

        petraRook[0] = reader.nextInt();
        petraRook[1] = reader.nextInt();

        gardarPawn[0] = reader.nextInt();
        gardarPawn[1] = reader.nextInt();

        if (petraRook[0] != gardarPawn[0]) {
            res++;
        }

        if (petraRook[1] != gardarPawn[1]) {
            res++;
        }

        System.out.println(res);
        reader.close();
    }
}
