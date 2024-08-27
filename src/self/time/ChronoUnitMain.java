package self.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

// 시간 단위와 그 정보를 필드로 가지고 있는 ENUM
// 1분의 초(0~59초), 1시간의 분(0~59분), 하루의 시간(0~23시) 등 상위 단위 내의 하위 단위를 나타내는 ENUM
public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for(ChronoUnit value :values) {
            System.out.println(value);
        }
        // Nanos
        // Micros
        // Millis
        // Seconds
        // Minutes
        // Hours
        // HalfDays
        // Days
        // Weeks
        // Months
        // Years
        // Decades
        // Centuries
        // Millennia
        // Eras
        // Forever

        System.out.println("HOURS = " + ChronoUnit.HOURS);      // HOURS = Hours
        System.out.println("HOURS.duration = " + ChronoUnit.HOURS.getDuration().getSeconds());     // HOURS.duration = 3600
        System.out.println("DAYS = " + ChronoUnit.DAYS);        // DAYS = Days
        System.out.println("DAYS.duration = " + ChronoUnit.DAYS.getDuration().getSeconds());       // DAYS.duration = 86400

        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(1, 20 ,0);

        long secondBetween = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println("secondBetween = " + secondBetween);     // secondBetween = 600

        long minuteBetween = ChronoUnit.MINUTES.between(lt1, lt2);
        System.out.println("minuteBetween = " + minuteBetween);     // minuteBetween = 10
    }
}
