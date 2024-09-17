abstract class Node {
    public abstract double eval(); 
}
abstract class Binop extends Node {
    protected Node lChild; 
    protected Node rChild;

    public Binop(Node l, Node r) {
        lChild = l;
        rChild = r;
    }
}

public class Plus extends Binop {
    public Plus(Node l, Node r) {
        super(l, r);
    }

    @Override
    public double eval() {
        return lChild.eval() + rChild.eval();  
    }
}

public class Const extends Node {
    private double value;

    public Const(double d) {
        value = d;
    }

    @Override
    public double eval() {
        return value; 
    }
}

public class TestArithmetic {
    public static void main(String[] args) {
        Node n = new Plus(
            new Plus(
                new Const(1.1), new Const(2.2) 
            ),
            new Const(3.3)
        );
        System.out.println(n.eval()); 
    }
}
