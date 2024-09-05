public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static void main(String[] args) {
        Time time = new Time(12, 30, 45);
        System.out.printf("%02d:%02d:%02d%n", time.hour, time.minute, time.second);
    }
}
