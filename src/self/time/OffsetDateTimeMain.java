package self.time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        // OffsetDateTime
        // 시간대를 고려한 날짜와 시간을 표현할 때 사용
        // 여기에는 타임존이 없고, UTC로부터 시간대 차이인 고정된 오프셋만 포함한다.
        // ex) 2013-11-21T08:20:30.213+9:00
        // ZoneId가 없으므로 일광 절약 시간제가 적용되지 않는다.

        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);       // nowOdt = 2024-08-27T11:14:32.811917800+09:00

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("ldt = " + ldt);             // ldt = 2030-01-01T13:30:50

        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt +01:00 = " + odt);      // odt +01:00 = 2030-01-01T13:30:50+01:00
    }
}
