import java.util.Calendar;

class LastDayOfCurrMonthGetter{
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("the last day in current month is: "+calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}