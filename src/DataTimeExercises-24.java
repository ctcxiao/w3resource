import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Exercises24{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("\nDefault format of LocalDate="+date);
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Default format of LocalDateTime="+dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
        Instant timestamp = Instant.now();
        System.out.println("Default format of Instant="+timestamp);

    }
}