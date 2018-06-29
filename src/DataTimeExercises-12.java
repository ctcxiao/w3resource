import java.text.DateFormatSymbols;
import java.util.Locale;

class DayInWeekName{
    public static void main(String[] args) {
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("ch"));

        String[] dayNames = symbols.getWeekdays();
        for (String s : dayNames) {
            System.out.println(s);
        }
    }
}