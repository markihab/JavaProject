package Inheritance;

public class Rectangle {
    protected double length;
    protected double width;
    protected double side = 4;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculatePerimeter(){
        return (2*length) + (2*width) ;
    }

    public void print(){
        System.out.println("This is a Rectangle");
    }
}
