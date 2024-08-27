package self.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        // 생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);       // period = P10D
        int days = period.getDays();
        System.out.println("days = " + days);           // days = 10

        // 계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("currentDate = " + currentDate);     // currentDate = 2030-01-01
        System.out.println("plusDate (+10d) = " + plusDate);           // plusDate (+10d) = 2030-01-11

        // 기간 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate   = LocalDate.of(2024, 4, 2);
        Period gap = Period.between(startDate, endDate);
        System.out.println("gap = " + gap);     // gap = P3M1D
        System.out.println(gap.getYears() + "년 " + gap.getMonths() + "개월 " + gap.getDays() + "일 차이");       // 1년 3개월 1일 차이

    }
}
