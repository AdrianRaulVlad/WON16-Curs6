public class Clock {
    private int hour = 6;
    private int minutes;

    // constructor
    public Clock() {

    }

    public Clock(int h, int m) {
        hour = h;
        minutes = m;
    }

    // encapsulation
    void setTime(int h, int m) {
        if (h > 23) {
            hour = 23;
        } else {
            hour = h;
        }
        if (m > 59) {
            minutes = 59;
        } else {
            minutes = m;
        }
    }

    String getTime() {
        return hour + ":" + minutes;
    }
}
