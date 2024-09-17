
public class UninitializedString 
    String str;

    public void checkInitialization() {
        if (str == null) {
            System.out.println("The String is initialized to null.");
        } else {
            System.out.println("The String is initialized with a value: " + str);
        }
    }

    public static void main(String[] args) {
        UninitializedString obj = new UninitializedString();
        
        obj.checkInitialization();
    }
}
