import java.util.Scanner;

public class monopol{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int cases = reader.nextInt();
        int diceOne = 0;
        int diceTwo = 0;
        double res = 0.0;

        for(int i = 0; i < cases; i++){
            int value = reader.nextInt();
            for(diceOne = 1; diceOne <= 6; diceOne++){
                for(diceTwo = 1; diceTwo <= 6; diceTwo++){
                    if(diceOne + diceTwo == value){
                        double diceProbability = (1.0/6.0) * (1.0/6.0);
                        res = res + diceProbability;
                    }
                }
            }

        }
        System.out.println(res);
    }
}
