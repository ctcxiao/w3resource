import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

class Exercises36{
    public static void main(String[] args) {
        long unix_seconds = 1372339860;
        Date date = new Date(unix_seconds*1000L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-4"));
        String java_date = simpleDateFormat.format(date);
        System.out.println(java_date);
    }
}