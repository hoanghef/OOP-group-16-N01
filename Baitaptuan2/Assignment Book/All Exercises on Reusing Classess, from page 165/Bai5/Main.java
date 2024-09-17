
class A {
    A() {
        System.out.println("Class A constructor called");
    }
}

class B {
    B() {
        System.out.println("Class B constructor called");
    }
}

class C extends A {
    B b;  
}

public class Main {
    public static void main(String[] args) {
        C c = new C();  
    }
}
