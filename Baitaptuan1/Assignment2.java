public class Number {
    public int i;
}

public class Assignment2 {
    public static void main(String[] args) {
        Number N1 = new Number();
        Number N2 = new Number();
        N1.i = 2;
        N2.i = 5;
        N1 = N2;
        N2.i = 10;
        N1.i = 20;

        System.out.println("N1.i: " + N1.i);
        System.out.println("N2.i: " + N2.i);
    }
}
