
class BaseClass {
    public BaseClass() {
        System.out.println("BaseClass constructor called");
    }
}

class DerivedClass extends BaseClass {
    public DerivedClass() {
        System.out.println("DerivedClass constructor called");
    }
}

public class TestConstructors {
    public static void main(String[] args) {
        DerivedClass derived = new DerivedClass();
    }
}
