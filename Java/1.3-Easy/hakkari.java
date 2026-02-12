import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class hakkari {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String[] split = input.split(" ");

        int rows = Integer.parseInt(split[0]);
        int columns = Integer.parseInt(split[1]);
        int res = 0;
        List<String> mines = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            String line = reader.nextLine();
            for (int j = 0; j < columns; j++) {
                char field = line.charAt(j);
                if (field == '*') {
                    res++;
                    mines.add((i + 1) + " " + (j + 1));
                }
            }
        }

        System.out.println(res);
        for (int i = 0; i < res; i++) {
            System.out.println(mines.get(i));
        }
    }
}
