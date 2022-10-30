package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        Rectangle kitchen = calculator.getRoom("Kitchen");

        Rectangle bathroom = calculator.getRoom("Bathroom");

        calculator.scan.close();

        System.out.println("The total Area = " + calculator.calculateTotalArea(kitchen,bathroom));
    }

    public Rectangle getRoom(String name){

        System.out.println("Enter the length of the " + name +" !");
        double length = scan.nextDouble();
        System.out.println("Enter the width of the " + name + " !");
        double width = scan.nextDouble();

        return new Rectangle(length,width);
    }

    public double calculateTotalArea (Rectangle R1 , Rectangle R2) {
        return ((R1.calculateArea()) + (R2.calculateArea()));
    }

}
