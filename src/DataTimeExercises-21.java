import java.time.LocalDateTime;
import java.time.ZoneId;

class Exercises21 {
    public static void main(String[] args) {
        ZoneId.SHORT_IDS.keySet().forEach(
                zoneKey -> System.out.println(" " + ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey)) + ": " +
                        LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey)))));
    }
}