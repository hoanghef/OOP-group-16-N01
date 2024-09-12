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

    