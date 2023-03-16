import java.util.*;

public class YearException extends Exception {
    private int badYear;
    public YearException(int year) {
        super ("YearException");
        badYear = year;
    }
    public YearException() {
        super ("YearException");
    }
    public YearException(String msg) {
        super (msg);
    }
    public int getBadYear() {
        return badYear;
    }
}
