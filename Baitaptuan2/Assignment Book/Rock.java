class Rock {
    Rock(){
        System.out.println("Rock");
    }
}

public class SimpleConstructor{
    public static void main(Strings[] args) {
        for (int i=0; i<10; i++)
        new Rock();
    }
}
//output:
//Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock 

class Rock2{
    Rock2(int i){
        System.out.print("Rock " + i +" ");
    }
}
public class SimpleConstructor2{
    public static void main(String [] args) {
        for (int i=0; i<8; i++)
        new Rock2(i);
    }
}
//Out put:
//Rock 0 Rock 1 Rock 2 Rock 3 Rock 4 Rock 5 Rock 6 Rock 7
