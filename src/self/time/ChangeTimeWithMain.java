package self.time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 39, 59);
        System.out.println("dt = " + dt);                       // dt = 2018-01-01T13:39:59

        LocalDateTime chagedDt1 = dt.with(ChronoField.YEAR, 2020);      // 새로운  LocalDateTime 객체를 반환
        System.out.println("changedDt1 = " + chagedDt1);        // changedDt1 = 2020-01-01T13:39:59
        System.out.println("dt = " + dt);                       // dt = 2018-01-01T13:39:59     // 기존 객체는 그대로 유지됨

        System.out.println();

        // 편의 메서드 사용
        LocalDateTime changedDt2 = dt.withYear(2020);
        System.out.println("changedDt2 = " + changedDt2);       // changedDt2 = 2020-01-01T13:39:59

        System.out.println();

        // TemporalAdjuster 사용
        // 다음주 금요일
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜 = " + dt);             // 기준 날짜 = 2018-01-01T13:39:59
        System.out.println("다음주 금요일 = " + with1);       // 다음 금요일 = 2018-01-05T13:39:59     // 다음주 가 아닌 기준 날짜의 다음 금요일을 출력(기준 날짜가 월요일이면 이번 주 금요일 출력됨)
    }
}
