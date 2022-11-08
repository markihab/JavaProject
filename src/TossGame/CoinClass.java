package TossGame;

import java.util.Random;

public class CoinClass {
    private String side;

    public  String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public  String [] headOrTail = {"head","tail"};

    public String flip(){
        Random r = new Random();
        String value = headOrTail[r.nextInt(headOrTail.length)];
        setSide(value);
        return getSide();
    }

}
