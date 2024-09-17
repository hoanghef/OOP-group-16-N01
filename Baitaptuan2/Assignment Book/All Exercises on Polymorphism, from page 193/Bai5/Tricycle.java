
class Tricycle extends Cycle {
    @Override
    int wheels() {
        return 3; 
    }
    
    @Override
    void ride() {
        System.out.println("Riding a tricycle with " + wheels() + " wheels.");
    }
}
