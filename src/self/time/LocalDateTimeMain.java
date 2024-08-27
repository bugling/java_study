package self.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    // 한 줄씩 코딩하고 실행시켜서 각 줄의 '지금 시간'에 차이가 있음
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2020, 1, 1, 1, 1, 1);

        System.out.println("지금 날짜 시간 = " + nowDt);      // 지금 날짜 시간 = 2024-08-27T09:52:23.386894
        System.out.println("지정된 날짜 시간 = " + ofDt);      // 지정된 날짜 시간 = 2020-01-01T01:01:01

        // 날짜와 시간 분리 가능
        // private final LocalDate date;    // LocalDateTime 내부는 LocalDate와 LocalTime으로 구성되어 있음
        // private final LocalTime time;
        LocalDate ld = nowDt.toLocalDate(); // '~로 변환'이라는 의미를 가지고 있으므로 메서드 이름이 toXXXX로 되어있음
        LocalTime lt = nowDt.toLocalTime();

        System.out.println("지금 날짜만 출력 = " + ld);        // 지금 날짜만 출력 = 2024-08-27
        System.out.println("지금 시간만 출력 = " + lt);        // 지금 시간만 출력 = 09:55:55.512147200

        // 날짜와 시간 합체
        LocalDateTime combinedLocalDateTime = LocalDateTime.of(ld, lt);
        System.out.println("합쳐진 날짜 시간 = " + combinedLocalDateTime);     // 합쳐진 날짜 시간 = 2024-08-27T10:00:33.663919400

        // 계산(불변)   -> 변경이 발생하는 경우 새로운 객체를 생성해서 반환하므로 반환값을 받아야 한다.
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정된 날짜 시간 + 1000d = " + ofDtPlus);          // 지정된 날짜 시간 + 1000d = 2022-09-27T01:01:01
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("지정된 날짜 시간 + 1y = " + ofDtPlus1Year);        // 지정된 날짜 시간 + 1y = 2021-01-01T01:01:01

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDt.isBefore(ofDt));   // 현재 날짜시간이 지정 날짜시간보다 이전인가? false
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDt.isAfter(ofDt));    // 현재 날짜시간이 지정 날짜시간보다 이후인가? true
        System.out.println("현재 날짜시간과 지정 날짜시간이 같은가? " + nowDt.isEqual(ofDt));       // 현재 날짜시간과 지정 날짜시간이 같은가? false

        // isEquals() vs equals()
        // isEquals()는 단순하게 시간적으로 같으면 true를 반환한다. 객체가 다르고, 타임존이 달라도 시간적으로 같으면 true를 반환한다.
        // 쉽게 이야기해서 시간적으로 둘을 비교한다.
        // equals()는 객체의 타입, 타임존 등등 내부 데이터의 모든 구성요소가 같아야 true를 반환한다.
        // ex) 서울의 9시와 UTC의 0시는 시간적으로 같다. 이 둘을 비교하면 타임존의 데이터가 다르기 때문에 false를 반환한다.
    }
}
