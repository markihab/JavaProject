package Polymorphism;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("WOOF");
    }

    public void fetch(){
        System.out.println("Fetching is good");
    }
}
