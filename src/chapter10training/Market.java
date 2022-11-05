package chapter10training;

public class Market {
    public static void main(String[] args) {
            Fruit fruit = new Fruit();
            fruit.makeJuice();
            fruit.setCalories(25);
            System.out.println("The calories for fruit is : " + fruit.getCalories());
            squeeze(fruit);

            Fruit apple = new Apple();
            apple.makeJuice();
            apple.setCalories(25);
            System.out.println("The calories for fruit is : " + apple.getCalories());
            squeeze(apple);

            Fruit banana = new Banana();
            banana.makeJuice();
            banana.setCalories(25);
            System.out.println("The calories for fruit is : " + banana.getCalories());
            squeeze(banana);
    }

    public static void squeeze(Fruit fruit){
        if(fruit instanceof Apple){
            System.out.println("Squeeze apple");
        } else if (fruit instanceof Banana) {
            System.out.println("Squeeze banana");
        }
        else {
            System.out.println("fruit is not defined");
        }
    }
}
