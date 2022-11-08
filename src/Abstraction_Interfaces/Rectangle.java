package Abstraction_Interfaces;

public class Rectangle extends Shape{

    private double length;
    private double width;

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

    public Rectangle (double length , double width){
        this.length=length;
        this.width=width;
    }

    @Override
    double calculateArea() {
        return length*width;
    }
}