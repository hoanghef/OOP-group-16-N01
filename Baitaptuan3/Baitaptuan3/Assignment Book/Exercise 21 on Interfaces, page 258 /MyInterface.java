public interface MyInterface {
    void method1();
    void method2();

    class Helper {
        public static void displayResults(MyInterface instance) {
            System.out.println("Calling method1:");
            instance.method1();
            System.out.println("Calling method2:");
            instance.method2();
        }
    }
}
