package Shapes;

public class Main {
    public static void main(String[] args) {
        
        Square square = new Square(8);
        Rectangle rectangle = new Rectangle(5, 8);
        Triangle triangle = new Triangle(11, 13, 15);

        
        Shape[] shapes = { square, rectangle, triangle };

    
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        shapeCollection.getPropertyValues();
    }
}
