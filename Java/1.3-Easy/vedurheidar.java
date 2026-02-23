import java.util.Scanner;

public class vedurheidar {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int safeWind = Integer.parseInt(reader.nextLine());
        int roads = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < roads; i++) {
            String road = reader.nextLine();
            String value = getValue(road, safeWind);
            System.out.println(value);
        }
    }

    private static String getValue(String road, int safeWind){
        String[] split = road.split(" ");
        String nameRoad = split[0];
        int wind = Integer.parseInt(split[1]);

        StringBuilder sb = new StringBuilder();
        sb.append(nameRoad);

        if (wind < safeWind) {
            sb.append(" lokud");
        } else {
            sb.append(" opin");
        }

        return sb.toString();
    }
}
