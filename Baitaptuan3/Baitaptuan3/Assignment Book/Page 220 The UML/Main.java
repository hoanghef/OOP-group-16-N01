
abstract class Instrument {

    abstract void play();
    
    String what() {
        return "Instrument";
    }
    
    abstract void adjust();
}

class Wind extends Instrument {
    void play() {
        System.out.println("Wind instrument is playing");
    }
    
    String what() {
        return "Wind";
    }
    
    void adjust() {
        System.out.println("Adjusting wind instrument");
    }
}

class Percussion extends Instrument {
    void play() {
        System.out.println("Percussion instrument is playing");
    }
    
    String what() {
        return "Percussion";
    }
    
    void adjust() {
        System.out.println("Adjusting percussion instrument");
    }
}

class Stringed extends Instrument {
    void play() {
        System.out.println("Stringed instrument is playing");
    }
    
    String what() {
        return "Stringed";
    }
    
    void adjust() {
        System.out.println("Adjusting stringed instrument");
    }
}

class Woodwind extends Wind {
    void play() {
        System.out.println("Woodwind instrument is playing");
    }
    
    String what() {
        return "Woodwind";
    }
    
    void adjust() {
        System.out.println("Adjusting woodwind instrument");
    }
}

class Brass extends Wind {
    void play() {
        System.out.println("Brass instrument is playing");
    }
    
    String what() {
        return "Brass";
    }
    
    void adjust() {
        System.out.println("Adjusting brass instrument");
    }
}
public class OrchestraTest {
    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Woodwind(),
            new Brass()
        };
        
        for (Instrument instrument : orchestra) {
            instrument.play();
            System.out.println("Type: " + instrument.what());
            instrument.adjust();
            System.out.println();
        }
    }
}
