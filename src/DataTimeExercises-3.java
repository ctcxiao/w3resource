import java.util.Calendar;

class MaxYMWDGetter{
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("Current Date and Time:" + cal.getTime());
        int actualMaxYear = cal.getActualMaximum(Calendar.YEAR);
        int actualMaxMonth = cal.getActualMaximum(Calendar.MONTH);
        int actualMaxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int actualMaxDate = cal.getActualMaximum(Calendar.DATE);

        System.out.println("Actual Maximum Year: "+actualMaxYear);
        System.out.println("Actual Maximum Month: "+actualMaxMonth);
        System.out.println("Actual Maximum Week of Year: "+actualMaxWeek);
        System.out.println("Actual Maximum Date: "+actualMaxDate+"\n");
    }
}