package self.time.test;

import java.time.LocalDateTime;

public class TestPlus {

    public static void main(String[] args) {

        LocalDateTime dateTime =  LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        // 1년 2개월 3일 4시간 이후의 시간을 구하기
        LocalDateTime futureDateTime = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("기준 시각 = "+ dateTime);                               // 기준 시각 = 2024-01-01T00:00
        System.out.println("1년 2개월 3일 4시간 이후의 시각 = " + futureDateTime);     // 1년 2개월 3일 4시간 이후의 시각 = 2025-03-04T04:00
    }
}
