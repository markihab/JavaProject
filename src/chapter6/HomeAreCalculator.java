package chapter6;

public class HomeAreCalculator {
    public static void main(String[] args) {
        //Create Rectangle 1
        Rectangle R1 = new Rectangle();
        R1.setWidth(25);
        R1.setLength(50);

        double AreaOfRoom1 = R1.calculateArea();

        //Create Rectangle 2
        Rectangle R2 = new Rectangle(15,75);
        double AreaOfRoom2 = R2.calculateArea();

        //Calculate total area
        double totalArea = AreaOfRoom1 + AreaOfRoom2;

        System.out.println("The total area is : " + totalArea);
    }

}
