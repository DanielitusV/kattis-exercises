import java.util.Scanner;

public class bestagjofin {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cases = reader.nextInt();
        Gift bestGift = new Gift("No one", 0);

        for (int i = 0; i < cases; i++) {
            String name = reader.next();
            int value = reader.nextInt();
            
            if (value > bestGift.getValue()) {
                bestGift = new Gift(name, value);
            }
        }

        System.out.println(bestGift.getOwner());
        reader.close();
    }
}

class Gift {
    private String owner;
    private int value;

    public Gift(String name, int value) {
        this.owner = name;
        this.value = value;
    }

    public String getOwner() {
        return owner;
    }

    public int getValue() {
        return value;
    }
}