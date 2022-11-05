package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.setName("Glenda");
        System.out.println("Mother name " + mother.getName() + "Mother Gender" + mother.getGender());
    }

    public void printTest(){
        Rectangle rec = new Rectangle();
        rec.print();

        Square squ = new Square();
        squ.print("Square");
        squ.print();
    }
}
