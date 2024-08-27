package self.time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);               // dt = 2018-01-01T13:30:59

        // 편의 메서드를 사용하지 않고 ChronoUnit을 사용해서 날짜를 조작하는 방법
        LocalDateTime plusDt1 = dt.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDt1 = " + plusDt1);     // plusDt1 = 2028-01-01T13:30:59

        // 편의 메서들르 사용해서 날짜를 조작하는 방법
        LocalDateTime plusDt2 = dt.plusYears(10);
        System.out.println("plusDt2 = " + plusDt2);     // plusDt2 = 2028-01-01T13:30:59

        // Period객체를 생성해서 날짜를 조작하는 방법
        // Period나 Duration은 기간(시간의 간격)을 뜻함. 특정 시점의 시간에 기간을 더할 수 있다.
        Period period = Period.ofYears(10);
        LocalDateTime plusDt3 = dt.plus(period);
        System.out.println("plusDt3 = " + plusDt3);     // plusDt3 = 2028-01-01T13:30:59

        // 정리
        // 시간을 조회하고 조작하는 부분을 보명 TemporalAccessor.get(), Temporal.plus()와 같은 인터페이스를 통해 특정 구현 클래스와 무관하게 아주 일관성 있는 시간 조회, 조작 기능을 제공하는 것을 확인할 수 있다.
        // 덕분에 LocalDateTime, LocalDate, LocalTime, ZonedDateTime, Instant와 같은 수많은 구현에 관계없이 일관성있는 방법으로 시간을 조회하고 조작할 수 있다.
    }
}
