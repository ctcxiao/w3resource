import java.time.LocalTime;

class CurrentTimeAdder{
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime newTime = time.plusHours(4);
        System.out.println("Time after 4 hours : " + newTime);
    }
}