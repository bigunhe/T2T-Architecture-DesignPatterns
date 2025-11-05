package FactoryMethod;

public class FactoryDemo {
    public static void main(String[] args) {

//        create a shape factory object
        ShapeFactory sf = new ShapeFactory();

//        take inputs to create different shapes
        Shape s1 = sf.getShape("circle");
        Shape s2 = sf.getShape("rectangle");
        Shape s3 = sf.getShape("square");

        s1.draw();
        s2.draw();
        s3.draw();
    }
}
