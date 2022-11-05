package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.makeSound();
        rocky.fetch();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);



    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
                    System.out.println("Dog is feeded");
                }
        else{
            System.out.println("Cat is feeded");
        }
    }
}
