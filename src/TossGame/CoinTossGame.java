package TossGame;

import java.util.Objects;
import java.util.Scanner;

public class CoinTossGame {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = new Player("Mark");
        Player player2 = new Player("Amr");
        CoinClass coin = new CoinClass();
        String value;
        System.out.println("Hello Mark! Choose head or tail");
        value = scan.next();
        value.toLowerCase();
        if(value.equals("head") || value.equals("tail")){
            player1.setGuess(value);
            if(Objects.equals(player1.getGuess(), "head")){
                player2.setGuess("tail");
            }
            else{
                player2.setGuess("head");
            }

            String result = coin.flip();

            if(Objects.equals(result, player1.getGuess())){
                System.out.println("Wohooo mark won the game");
            } else if (Objects.equals(result, player2.getGuess())) {
                System.out.println("Whohoo amr won the game");
            }
        }
        else {
            System.out.println("Please make sure to enter head or tail only");
        }
    }
}
