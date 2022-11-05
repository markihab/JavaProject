package chapter10training;

public class Banana extends Fruit{

    public Banana(){
        setCalories(80);
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana Juice is made");
    }

    public void peel(){
        System.out.println("Banana is peeled");
    }

}
