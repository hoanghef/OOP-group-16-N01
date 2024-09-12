
public class Radar {

    public static double getSignalValue(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (double) n / 15;
        } else {
            return 0; 
        }
    }


