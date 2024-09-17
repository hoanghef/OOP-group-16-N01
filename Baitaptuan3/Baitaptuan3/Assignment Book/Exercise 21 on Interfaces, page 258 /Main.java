public class Main {
    public static void main(String[] args) {
        MyInterface myInstance = new MyImplementation();
        MyInterface.Helper.displayResults(myInstance);
    }
}
