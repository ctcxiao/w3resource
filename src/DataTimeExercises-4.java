import java.util.Calendar;

class MinYMWDGetter{
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("now time is: "+calendar.getTime());
        int minYear = calendar.getActualMinimum(Calendar.YEAR);
        int minMonth = calendar.getActualMinimum(Calendar.MONTH);
        int minWeek = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int minDay = calendar.getActualMinimum(Calendar.DATE);

        System.out.println("Actual Minimun Year: "+minYear);
        System.out.println("Actual Minimun Month: "+minMonth);
        System.out.println("Actual Minimun Week: "+minWeek);
        System.out.println("Actual Minimun Day: "+minDay);
    }
}