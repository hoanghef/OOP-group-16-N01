
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
    
    void printMessage() {
        System.out.println("Message from Shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
    
    @Override
    void printMessage() {
        System.out.println("Message from Rectangle.");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle.");
    }
    
    @Override
    void printMessage() {
        System.out.println("Message from Triangle.");
    }
}

