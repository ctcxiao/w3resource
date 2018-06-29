import java.time.LocalTime;

class LocalTimeInCal{
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        // in hour, minutes, seconds, nano seconds
        System.out.println("Local time now : " + time);
    }
}