package Zoom.Factory;

public class CircleFactory  implements ShapeFactory{

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
