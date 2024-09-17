
public class Detergent {

    public void scrub() {
        System.out.println("Detergent scrub");
    }
}

public class SpecialDetergent extends Detergent {

    @Override
    public void scrub() {
        System.out.println("SpecialDetergent scrub");
    }

    public void sterilize() {
        System.out.println("SpecialDetergent sterilize");
    }

    public static void main(String[] args) {
        SpecialDetergent specialDetergent = new SpecialDetergent();

        specialDetergent.scrub(); 
        specialDetergent.sterilize(); 
    }
}

