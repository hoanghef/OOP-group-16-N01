
class ConcreteClass extends AbstractBase {
    ConcreteClass(int num) {
        super(num);
    }

    @Override
    void display() {
        System.out.println("Displaying from ConcreteClass");
    }
}
