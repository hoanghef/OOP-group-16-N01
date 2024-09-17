
class Unicycle extends Cycle {
    @Override
    int wheels() {
        return 1; 
    }
    
    @Override
    void ride() {
        System.out.println("Riding a unicycle with " + wheels() + " wheel.");
    }
}
