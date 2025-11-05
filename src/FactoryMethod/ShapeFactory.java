package FactoryMethod;

public class ShapeFactory {

//    method to get user input on the shape type. based on type, return a new shape
//    this method creates new objects on behalf of us.
    public Shape getShape(String type){
        switch (type){
            case "circle":
                return new Circle();

            case "rectangle":
                return new Rectangle();

            case "square":
                return new Square();

            default:
                return null;
        }
    }
}
