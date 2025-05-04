package Factory_method;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.createShape("CIRCLE");
        shape1.draw();

        Shape shape2 = factory.createShape("RECTANGLE");
        shape2.draw();
    }
}

