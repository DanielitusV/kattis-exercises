import java.util.Scanner;

public class hradgreining {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.next();

        boolean checked = checkCovid(input);
        if (checked) {
            System.out.println("Veikur!");
        } else {
            System.out.println("Ekki Veikur!");
        }
    }

    private static boolean checkCovid(String line) {
        boolean res = false;
        int length = line.length();
        int i = 0;

        while (i < length - 2 && !res) {
            if (line.charAt(i) == 'C') {
                if (line.charAt(i + 1) == 'O') {
                    if (line.charAt(i + 2) == 'V') {
                        res = true;
                    }
                }
            }
            i++;
        }

        return res;
    }
}
