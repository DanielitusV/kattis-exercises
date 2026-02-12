import java.util.Scanner;

public class barcelona {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cases = reader.nextInt();
        int benniBag = reader.nextInt();
        int i = 0;
        boolean found = false;

        while (i <= cases && !found){
            i++;
            int bag = reader.nextInt();
            if (benniBag == bag) {
                found = true;
            }
        }

        if (i == 1) {
            System.out.println("fyrst");
        } else if (i == 2) {
            System.out.println("naestfyrst");
        } else {
            System.out.println(i + " fyrst");
        }
    }
}
