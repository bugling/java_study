package self.time;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);

        // TemporalAccessor.get(TemporalField field)
        // - LocalDateTime을 포함한 특정 시점의 시간을 제공하는 클래스는 모두 TemporalAccessor 인터페이스를 구현한다.
        // - TemporalAccessor는 특정 시점의 시간을 조회하는 기능을 제공한다.
        // - get(TemporalField field)을 호출할 때 어떤 날짜와 시간 필드를 조회할지 TemporalField의 구현인 ChronoField를 인수로 전달하면 된다.
        System.out.println("YEAR = " + dt.get(ChronoField.YEAR));                           // YEAR = 2030
        System.out.println("MONTH_OF_YEAR = " + dt.get(ChronoField.MONTH_OF_YEAR));         // MONTH_OF_YEAR = 1
        System.out.println("DAY_OF_MONTH = " + dt.get(ChronoField.DAY_OF_MONTH));           // DAY_OF_MONTH = 1
        System.out.println("HOUR_OF_DAY = " + dt.get(ChronoField.HOUR_OF_DAY));             // HOUR_OF_DAY = 13
        System.out.println("MINUTE_OF_HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR));       // MINUTE_OF_HOUR = 30
        System.out.println("SECOND_OF_MINUTE = " + dt.get(ChronoField.SECOND_OF_MINUTE));   // SECOND_OF_MINUTE = 59

        System.out.println();
        System.out.println("편의 메서드 제공");
        System.out.println("getYear = " + dt.getYear());                // getYear = 2030
        System.out.println("getMonthValue = " + dt.getMonthValue());    // getMonthValue = 1        *getMonth()는 Month객체를 반환
        System.out.println("getDayOfMonth = " + dt.getDayOfMonth());    // getDayOfMonth = 1
        System.out.println("getHour = " + dt.getHour());                // getHour = 13
        System.out.println("getMinute = " + dt.getMinute());            // getMinute = 30
        System.out.println("getSecond = " + dt.getSecond());            // getSecond = 59

        System.out.println();
        // - 자주 사용하지 않는 특별한 기능은 편의 메서드를 제공하지 않는다.
        // - 편의 메서드를 사용하는 것이 가독성이 좋기 때문에 일반적으로는 편의 메서드를 사용하고, 편의 메서드가 없는 경우 get(TemporalField field)을 사용하면 된다.
        System.out.println("편의 메서드 없음");
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY));     // MINUTE_OF_DAY = 810          *하루가 810분임을 반환함
        System.out.println("MINUTE_OF_SECOND = " + dt.get(ChronoField.SECOND_OF_DAY));  // MINUTE_OF_SECOND = 48659      *하루가 48659초임을 반환함

    }
}
