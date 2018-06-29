import java.time.LocalDateTime;

class Exercises28{
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now().minusHours(5).minusMinutes(30);
        System.out.println("Current Date and Time:  " + LocalDateTime.now());
        System.out.println("Before 5 houres and 30 minutes: " + dateTime);
    }
}