import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import static java.time.Period.*;

class Exercises19{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate userday = LocalDate.of(2017, Month.JULY, 16);
        Period diff = Period.between(userday, today);
        System.out.println("Difference between "+ userday +" and "+ today +": "
                + diff.getYears() +" Year(s) and "+ diff.getMonths() +" Month(s)");
    }
}