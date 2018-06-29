import java.util.Calendar;

class DataObjectCreator{
    public static void main(String[] args) {
        int year = 2018;
        int month = 0;
        int date = 10;

        Calendar cal = Calendar.getInstance();

        cal.clear();
        System.out.println();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);

        System.out.println(cal.getTime());
    }
}