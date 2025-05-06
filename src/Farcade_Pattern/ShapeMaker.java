package Farcade_Pattern;

public class ShapeMaker {
    private Circle circle = new Circle();
    private Square square = new Square();
    private Triangle triangle = new Triangle();

    public void drawCircle(){
        circle.draw();
    }
    public void drawTriangle(){
        triangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
