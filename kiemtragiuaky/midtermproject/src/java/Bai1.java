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
        return amplitude * Math.sin(2 * Math.PI * frequency * time + phase);
    }

    public double getPeriod() {
        return 1 / frequency;
    }

    public double getWavelength() {
        return speed / frequency;
    }

    public String toString() {
        return "ContinuousSignal [Amplitude: " + amplitude + ", Frequency: " + frequency + " Hz, Phase: " + phase +
               " rad, Period: " + getPeriod() + " s, Wavelength: " + getWavelength() + " m]";
    }
}

