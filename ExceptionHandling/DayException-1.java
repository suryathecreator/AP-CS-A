import java.util.*;

public class DayException extends Exception {
    private int badDay;
    public DayException(int day) {
        super ("DayException");
        badDay = day;
    }
    public DayException() {
        super ("DayException");
    }
    public DayException(String msg) {
        super (msg);
    }
    public int getBadDay() {
        return badDay;
    }
}
