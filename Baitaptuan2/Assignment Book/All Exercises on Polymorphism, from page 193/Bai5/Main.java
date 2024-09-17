
public class Main {
    public static void main(String[] args) {
        Cycle[] cycles = { 
            new Unicycle(), 
            new Bicycle(), 
            new Tricycle()
        };
        
        for (Cycle cycle : cycles) {
            cycle.ride();
        }
    }
}
