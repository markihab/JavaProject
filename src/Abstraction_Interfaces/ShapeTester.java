package Abstraction_Interfaces;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,7);
        rectangle.print();
        System.out.println("The area of the rectangle : " + rectangle.calculateArea());
    }
}
