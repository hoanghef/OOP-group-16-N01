
public class Radar {

    public static double getSignalValue(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (double) n / 15;
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {

        int n = 4;
        System.out.println("Giá trị của tín hiệu X(" + n + ") = " + getSignalValue(n));


        System.out.println("Giá trị tín hiệu từ n = 0 đến n = 15:");
        for (int i = 0; i <= 15; i++) {
            System.out.println("X(" + i + ") = " + getSignalValue(i));
        }
    }
}
