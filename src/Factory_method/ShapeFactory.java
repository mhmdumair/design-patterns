package Factory_method;

public class ShapeFactory {
    public Shape createShape(String type) {
        if ("CIRCLE".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(type)) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}

