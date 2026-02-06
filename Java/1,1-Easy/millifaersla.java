import java.util.Scanner;

public class millifaersla {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int monnei = reader.nextInt();
        int fjee = reader.nextInt();
        int dolladollabilljoll = reader.nextInt();

        String res = findMinor(monnei, fjee, dolladollabilljoll);
        System.out.println(res);

        reader.close();
    }

    private static String findMinor(int mon, int fje, int dol) {
        int min = Math.min(mon, Math.min(fje, dol));
        String res;
        
        if (min == mon) {
            res = "Monnei";
        } else if (min == fje) {
            res = "Fjee";
        } else {
            res = "Dolladollabilljoll";
        }
        return res;
    } 
}
