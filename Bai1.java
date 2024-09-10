// Giao diện tín hiệu Signal
public interface Signal {
    double getSignalValue(double time);  
    double getPeriod();  
    double getWavelength(); 
}

// Lớp tín hiệu rời rạc kế thừa Signal
public class DiscreteSignal implements Signal {
    private double amplitude;  
    private double frequency;  
    private double phase;      
    private double speed;      
    private double[] samples;  

    public DiscreteSignal(double amplitude, double frequency, double phase, double speed, double[] samples) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.phase = phase;
        this.speed = speed;
        this.samples = samples;
    }

    public double getSignalValue(double time) {
        int index = (int) time; 
        if (index >= 0 && index < samples.length) {
            return amplitude * samples[index];
        } else {
            return 0; 
        }
    }

    public double getPeriod() {
        return 1 / frequency;
    }

    public double getWavelength() {
        return speed / frequency;
    }

    public String toString() {
        return "DiscreteSignal [Amplitude: " + amplitude + ", Frequency: " + frequency + " Hz, Phase: " + phase +
               " rad, Period: " + getPeriod() + " s, Wavelength: " + getWavelength() + " m]";
    }
}

// Lớp tín hiệu liên tục kế thừa Signal
public class ContinuousSignal implements Signal {
    private double amplitude;  
    private double frequency;  
    private double phase;      
    private double speed;     

    public ContinuousSignal(double amplitude, double frequency, double phase, double speed) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.phase = phase;
        this.speed = speed;
    }

    public double getSignalValue(double time) {
        // Tính giá trị tín hiệu liên tục theo công thức sóng sin
        return amplitude * Math.sin(2 * Math.PI * frequency * time + phase);
    }

    public double getPeriod() {
        // Chu kỳ (T) là nghịch đảo của tần số: T = 1 / f
        return 1 / frequency;
    }

    public double getWavelength() {
        // Bước sóng (λ) là vận tốc chia cho tần số: λ = v / f
        return speed / frequency;
    }

    public String toString() {
        return "ContinuousSignal [Amplitude: " + amplitude + ", Frequency: " + frequency + " Hz, Phase: " + phase +
               " rad, Period: " + getPeriod() + " s, Wavelength: " + getWavelength() + " m]";
    }
}

// Lớp kiểm thử
public class Main {
    public static void main(String[] args) {
        double[] samples = {1, 0.5, -1, -0.5, 0};
        DiscreteSignal discreteSignal = new DiscreteSignal(1.0, 50.0, 0.0, 340.0, samples);  // Vận tốc âm thanh là 340 m/s

        ContinuousSignal continuousSignal = new ContinuousSignal(1.0, 50.0, 0.0, 340.0);

        System.out.println(discreteSignal);
        for (int i = 0; i < samples.length; i++) {
            System.out.println("Discrete Signal at time " + i + ": " + discreteSignal.getSignalValue(i));
        }

        System.out.println(continuousSignal);
        for (int i = 0; i < 5; i++) {
            System.out.println("Continuous Signal at time " + i + ": " + continuousSignal.getSignalValue(i));
        }
    }
}
