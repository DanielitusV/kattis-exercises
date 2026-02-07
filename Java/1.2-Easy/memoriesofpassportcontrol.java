import java.util.Scanner;

public class memoriesofpassportcontrol {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int multiples = reader.nextInt();
        int pages = reader.nextInt();

        int multipleStamps = pages / multiples;
        int singleStamps = pages % multiples;
        int res = multipleStamps + singleStamps;

        System.out.println(res);
    }
}
