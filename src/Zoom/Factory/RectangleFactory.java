package Zoom.Factory;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
