
class DerivedClass extends BaseClass {

    int number = 10; 

    
    DerivedClass() {
        System.out.println("DerivedClass constructor");
    }

    @Override
    void print() {
        System.out.println("Number: " + number);
    }
}
