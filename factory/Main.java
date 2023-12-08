package factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        shape shape3 = shapeFactory.getShape("square");
        shape3.draw();
    }
}
