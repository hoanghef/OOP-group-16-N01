
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = { 
            new Circle(), 
            new Rectangle(), 
            new Triangle(), 
            new Pentagon() 
        };
        
        for (Shape shape : shapes) {
            shape.draw();
            shape.printMessage();
        }
    }
}
