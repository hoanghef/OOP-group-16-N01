class Rodent {
    void eat() {
        System.out.println("Rodent is eating");
    }
    
    void sleep() {
        System.out.println("Rodent is sleeping");
    }
    
    void makeSound() {
        System.out.println("Rodent makes a sound");
    }
}

class Mouse extends Rodent {
    @Override
    void eat() {
        System.out.println("Mouse is eating cheese");
    }
    
    @Override
    void makeSound() {
        System.out.println("Mouse squeaks");
    }
}

class Hamster extends Rodent {
    @Override
    void eat() {
        System.out.println("Hamster is eating seeds");
    }
    
    @Override
    void makeSound() {
        System.out.println("Hamster chirps");
    }
}

public class RodentTest {
    public static void main(String[] args) {
        Rodent mouse = new Mouse();
        mouse.eat();
        mouse.makeSound();
        
        Rodent hamster = new Hamster();
        hamster.eat();
        hamster.makeSound();
    }
}
