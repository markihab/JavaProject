package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int LOWERBOUND = 1;
    private static final int UPPERBOUND = 69;

    public static void main(String[] args) {

        int [] ticket = generateNumbers();
        Arrays.sort(ticket);
        print(ticket);
    }

    public static int[] generateNumbers(){
        int [] ticket = new int[LENGTH];
        Random rand = new Random();
        for(int i = 0; i < LENGTH; i++)
        {
            int randNumber;
            do {
                randNumber = rand.nextInt(LOWERBOUND,UPPERBOUND);
            }while(search(ticket,randNumber));
            ticket[i] = randNumber;
        }
        return ticket;
    }

    public static void print(int [] ticket){
        for (int i = 0; i < LENGTH; i++) {
            System.out.println(ticket[i] + " ");
        }
    }

    /**
     *
     * @param array
     * @param valueToSearchFor
     * @return
     */
    public static Boolean search (int [] array , int valueToSearchFor) {
        for (int val:
             array) {
            if(val == valueToSearchFor){
            return true;
            }
        }
        // if we reached this point then the entire arraay is searched & value was not found
        return false;
    }
}
