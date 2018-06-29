import java.util.Calendar;

class DayInSpecificData{
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of the week : " + dayOfWeek);
    }
}