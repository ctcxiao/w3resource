import java.time.LocalDate;
import java.time.Period;

class Exercises30{
    public static void main(String[] args) {
        LocalDate pdate = LocalDate.of(2018, 1, 10);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(pdate, now);

        System.out.printf("Difference is %d years, %d months and %d days old",
                diff.getYears(), diff.getMonths(), diff.getDays());
    }
}