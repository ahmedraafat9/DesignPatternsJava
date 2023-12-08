
public class Client {

    public static void main(String[] args) {
        abstractFactory redFactory = new RedCircleFactory();
        abstractFactory blueFactory = new BlueRectangleFactory();

        Shape redCirlce = redFactory.createShape();
        Color redColor = redFactory.createColor();

        Shape blueRectangle = blueFactory.createShape();
        Color blueColor = blueFactory.createColor();

        redCirlce.draw();
        redColor.fill();

        blueRectangle.draw();
        blueColor.fill();

    }
}