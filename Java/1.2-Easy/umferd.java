import java.util.Scanner;

public class umferd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int columns = Integer.parseInt(reader.next());
        int rows  = Integer.parseInt(reader.next());
        int cells = columns * rows;
        int freeCell = 0;

        for (int i = 0; i < rows; i++) {
            String line = reader.next();
            for (int j = 0; j < columns; j++) {
                if (line.charAt(j) == '.') {
                    freeCell++;
                }
            }
        }
        double res = (double) freeCell / cells;
        System.out.println(res);
    }
}
