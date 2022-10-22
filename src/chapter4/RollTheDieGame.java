package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {
        // Given Data
        int boardSpaces = 20;
        int dieRolls = 5;

        //Roll the die for the user
        int remainingSpaces = 0 ;
        int accumulativeSpaces = 0;
        Random random = new Random();
        for(int i = 0 ; i < dieRolls ; i++){
            int die = random.nextInt(1,6);
            remainingSpaces = boardSpaces-die;
            System.out.println("Roll #" + (i+1) + " : You've rolled a " + die + " You are now on space 3 and have 17 more to go");
        }
    }
}
