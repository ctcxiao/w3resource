import java.time.LocalDate;
import java.time.Period;

class Exercises32{
    public static void main(String[] args) {
        LocalDate pdate = LocalDate.of(1996, 3, 9);

        LocalDate now = LocalDate.now();

        Period diff = Period.between(pdate, now);

        System.out.printf("I am  %d years, %d months and %d days old",
                diff.getYears(), diff.getMonths(), diff.getDays());
    }
}