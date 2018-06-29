import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Exercises35{
    public static void main(String[] args) {
        try {
            String originalString = "2018-06-18 09:00:02";
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(originalString);
            String newstr = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(date);
            System.out.println(newstr);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}