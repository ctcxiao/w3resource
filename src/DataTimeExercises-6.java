import java.util.Calendar;

class FullTimeGetter {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current full date and time is : " + (calendar.get(Calendar.MONTH) + 1) + "-"
                + calendar.get(Calendar.DATE) + "-" + calendar.get(Calendar.YEAR) + " "
                + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND) + "." + calendar.get(Calendar.MILLISECOND));
    }
}