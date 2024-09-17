// Lớp dùng để kiểm tra Rodent và các lớp con
public class RodentTest {
    public static void main(String[] args) {
        Rodent mouse = new Mouse();
        mouse.eat();
        mouse.sleep();
        mouse.makeSound();
        
        Rodent hamster = new Hamster();
        hamster.eat();
        hamster.sleep();
        hamster.makeSound();
    }
}
