
class Cycle {
    void ride() {
        System.out.println("Riding a cycle.");
    }
}

class Unicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding a unicycle.");
    }
}

class Bicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding a bicycle.");
    }
}

class Tricycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding a tricycle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle cycle1 = unicycle;
        Cycle cycle2 = bicycle;
        Cycle cycle3 = tricycle;

        cycle1.ride();  
        cycle2.ride();
        cycle3.ride();  
    }
}
