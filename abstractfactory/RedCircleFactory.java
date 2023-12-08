/**
 * RedCircleFactory
 */
public class RedCircleFactory implements abstractFactory{
    @Override
    public Color createColor() {
        return new Red();
    }
    @Override
    public Shape createShape() {
        return new Circle();
    }
}