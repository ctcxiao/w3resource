import java.util.Calendar;
import java.util.Date;

class TimeAfterTwoWeeks{
    public static void main(String[] args) {
        //two weeks
        int noOfDays = 14;
        Calendar cal = Calendar.getInstance();
        Date cdate = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, noOfDays);
        Date date = cal.getTime();
        System.out.println("Current Date: " + cdate);
        System.out.println("Day after two weeks: " + date);
    }
}