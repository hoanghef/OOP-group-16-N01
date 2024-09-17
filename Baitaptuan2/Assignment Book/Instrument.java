class Instrument{
    public void play(Note n){
        print("Instrument.play()");
    }
}
public class Wind extends Instrument {
    public void play(Note n){
        System.out.println("Wind.play() " + n)
    }
}
package polymorphism.music;

public class Music{
    public static void tune(Instrument i){
        i.play(Note_MIDDLE_C);
    }
    public static void main(String[] args){
        Wind flute = new Wind();
        tune(flute);
    }
}
//Output
//Wind.play() MIDDLE_C