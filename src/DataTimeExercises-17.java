import java.util.Calendar;
import java.util.Date;

class Exercises17{
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Date cdate = cal.getTime();
        cal.add(Calendar.YEAR, 1);

        Date nyear = cal.getTime();
        cal.add(Calendar.YEAR, -2);

        Date pyear = cal.getTime();

        System.out.println("Current Date : " + cdate);
        System.out.println("Date before 1 year : " + pyear);
        System.out.println("Date after 1 year  : " + nyear);
    }
}