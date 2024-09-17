public class Main {
    public static void main(String[] args) {
        Unicycle uni = new Unicycle();
        Bicycle bi = new Bicycle();
        Tricycle tri = new Tricycle();

        Cycle[] cycles = {uni, bi, tri};

        for (Cycle cycle : cycles) {
        }

        for (Cycle cycle : cycles) {
            if (cycle instanceof Unicycle) {
                ((Unicycle) cycle).balance(); 
            } else if (cycle instanceof Bicycle) {
                ((Bicycle) cycle).balance(); 
            } else if (cycle instanceof Tricycle) {
                System.out.println("Tricycle does not have a balance() method");
            }
        }
    }
}
