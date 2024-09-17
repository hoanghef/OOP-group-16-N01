
public class StringInitialization {

    String fieldAtDefinition = "Initialized at definition";

    String fieldInConstructor;

    public StringInitialization(String value) {
        this.fieldInConstructor = value;
    }

    public void printFields() {
        System.out.println("Field at definition: " + fieldAtDefinition);
        System.out.println("Field in constructor: " + fieldInConstructor);
    }

    public static void main(String[] args) {
        StringInitialization obj = new StringInitialization("Initialized in constructor");
        
        obj.printFields();
    }
}
