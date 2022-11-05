package chapter9training;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setFlavour("Mango");
        cake.setPrice(52);
        System.out.println("The flavour of the cake is : "+ cake.getFlavour());
        System.out.println("The price of the cake is : " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles("loving candles");
        birthdayCake.setFlavour("coco");
        birthdayCake.setPrice(90);
        System.out.println("The flavour of the cake is : "+ birthdayCake.getFlavour());
        System.out.println("The price of the cake is : " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setTiers("Tiers");
        weddingCake.setCandles("purple candles");
        System.out.println("The candles of the cake " + weddingCake.getCandles());

    }
}
