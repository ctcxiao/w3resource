import java.util.Calendar;
import java.util.GregorianCalendar;

class Exercises34{
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        System.out.println(cal.getTime());
    }
}