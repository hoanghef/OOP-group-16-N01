abstract class AbstractBase {
    
    void display() {
        System.out.println("Displaying from AbstractBase");
    }
    
  
    int number;

 
    AbstractBase(int num) {
        this.number = num;
    }


    void showNumber() {
        System.out.println("Number: " + number);
    }
}
