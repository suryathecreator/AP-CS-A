import java.util.*;

public class MonthException extends Exception {
    private int badMonth;
    public MonthException(int month) {
        super ("MonthException");
        badMonth = month;
    }
    public MonthException() {
        super ("MonthException");
    }
    public MonthException(String msg) {
        super (msg);
    }
    public int getBadMonth() {
        return badMonth;
    }
}
