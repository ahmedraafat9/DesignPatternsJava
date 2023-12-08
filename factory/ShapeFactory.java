package factory;

public class ShapeFactory {
    public shape getShape(String shapeType){
        if (shapeType == null) {
            return null;
        }
        else if (shapeType.equalsIgnoreCase("circle")) {
            return new circle();
        }
        else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new rectangle();
        }
        else if (shapeType.equalsIgnoreCase("square")) {
            return new square();
        }
        return null;
    }
}
