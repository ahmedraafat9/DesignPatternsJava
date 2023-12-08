/**
 * BlueRectangleFactory
 */
public class BlueRectangleFactory implements abstractFactory{
    @Override
    public Color createColor() {
        return new Blue();
    }
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}