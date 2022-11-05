package chapter10training;

public class Apple extends Fruit{

    public Apple(){
        setCalories(90);
    }

    @Override
    public void makeJuice() {
        System.out.println("Make apple juice");
    }

    public void removeSeeds(){
        System.out.println("Seeds removed");
    }

}
