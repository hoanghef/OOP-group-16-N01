package interfaces.music5;
import polymorphism.music.Note;
import static net.mindview.util.Print.*;

interface Instrument {
    int VALUE = 5 ;
    void play(Note n);
    void adjust();
}

class Wind implements Instrument {
    public void play (Note n) {
        print(this+ ".play()" + n);
        public String toString(){ return "Wind"; }
        public void adjust() { this + ".adjust()" };
    }
}

class  Percussion implements Instrument {
    public void play(Note n){
        print(this + ".play" + n);
    }
    public String toString() { return "Percusion"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Stringed implements Instrument {
    public void play(Note n){
        print(this + ".play()" + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust(){ print(this + ".adjust()"); }
}

class Brass extends Wind {
    public String toString() {return "Brass"; }
}

class Woodwind extends Wind {
    public String toString() { return "Woodwind"; }
}

public class Music5 {
    stactic void tune (Instrument i){
        i.play(Note.MIDDLE_C);
    }
}
static void tuneAll(Instrument[] e){
    for(Instrument i : e)
    tune(i);
}
public stactic void main (String[] args){
    Instrument[] orchestra = {
        new Wind(),
        new Percussion(),
        new Stringed(),
        new Brass(),
        new Woodwind(),
    };
    tune(orchestra);
}
//Output
//Wind.play() MIDDLE_C 
//Percussion.play() MIDDLE_C 
//Stringed.play() MIDDLE_C 
//Brass.play() MIDDLE_C 
//Woodwind.play() MIDDLE_C 