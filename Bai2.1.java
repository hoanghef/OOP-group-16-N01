import java.util.HashMap;
import java.util.Map;


public class DiscreteSignal {
    private Map<Integer, Double> signalValues; 

    public DiscreteSignal() {
        signalValues = new HashMap<>();
    }

    public void setSignalValue(int k, double value) {
        signalValues.put(k, value);
    }

    private int delta(int n) {
        return n == 0 ? 1 : 0;
    }

    
    public double getSignalValue(int n) {
        double result = 0.0;
        for (int k : signalValues.keySet()) {
            result += signalValues.get(k) * delta(n - k);
        }
        return result;
    }

    
    public void printSignal() {
        for (int k : signalValues.keySet()) {
            System.out.println("x(" + k + ") = " + signalValues.get(k));
        }
    }

    public static void main(String[] args) {
        DiscreteSignal signal = new DiscreteSignal();
        
   
        signal.setSignalValue(0, 1.0);
        signal.setSignalValue(1, 0.5);
        signal.setSignalValue(2, -0.5);
        signal.setSignalValue(3, 0.25);


        System.out.println("Tín hiệu ban đầu:");
        signal.printSignal();


        for (int n = -1; n <= 5; n++) {
            System.out.println("Giá trị tín hiệu tại n = " + n + ": x(" + n + ") = " + signal.getSignalValue(n));
        }
    }
}
