
class SimpleClass {
    public void displayMessage() {
        System.out.println("SimpleClass object is initialized!");
    }
}


public class LazyInitializationClass {

    private SimpleClass simpleObject;

    public SimpleClass getSimpleObject() {
        if (simpleObject == null) {
            System.out.println("Lazy initialization: Creating the SimpleClass object now...");
            simpleObject = new SimpleClass();
        }
        return simpleObject;
    }

    public static void main(String[] args) {
        LazyInitializationClass lazyObj = new LazyInitializationClass();

        System.out.println("SimpleClass object is still not initialized.");

        lazyObj.getSimpleObject().displayMessage();

        lazyObj.getSimpleObject().displayMessage();
    }
}
