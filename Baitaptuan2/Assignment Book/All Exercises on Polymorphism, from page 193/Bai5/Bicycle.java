
class Bicycle extends Cycle {
    @Override
    int wheels() {
        return 2; 
    }
    
    @Override
    void ride() {
        System.out.println("Riding a bicycle with " + wheels() + " wheels.");
    }
}
