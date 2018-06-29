import java.time.LocalTime;

class Exercises27{
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(2, 44, 22);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        System.out.println("Current Local time: " + time);
        System.out.println("the Hour: " + hour);
        System.out.println("the Minue: " + minute);
        System.out.println("the Second: " +second);
    }
}