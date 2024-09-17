
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Rectangle(), new Triangle() };
        
        for (Shape shape : shapes) {
            shape.draw();
            shape.printMessage();
        }
    }
}
