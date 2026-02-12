import java.util.Scanner;

public class heysata {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int length = Integer.parseInt(reader.nextLine());
        char needle = reader.nextLine().charAt(0);
        String hayStack = reader.nextLine();

        boolean found = false;
        int i = 0;

        while (i < length && !found) {
            char hay = hayStack.charAt(i);
            if (needle == hay) {
                found = true;
            }
            i++;
        }

        if (found) {
            System.out.println("Unnar fann hana!");
        } else {
            System.out.println("Unnar fann hana ekki!");
        }
    }
}
