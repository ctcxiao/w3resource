import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

class NewYorkTimer{
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in New York: " + calendar.get(Calendar.HOUR_OF_DAY) + ":"
                + calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
    }
}