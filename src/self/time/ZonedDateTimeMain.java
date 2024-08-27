package self.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {

        // ZonedDateTime
        // - 시간대를 고려한 날짜와 시간을 표현할 때 사용한다. 여기에는 시간대를 표현하는 타임존이 포함된다.
        // - ex) 2013-11-21T08:20:30.213+9:00[Asia/Seoul]
        // - +9:00은 UTC(협정 세계시)로 부터 시간대 차이(오프셋)이다. 한국은 UTC보다 +9:00 시간이다.
        // - 추가로 ZoneId를 통해 타임존을 알면 일광 절약 시간제에 대한 정보도 알 수 있다. 따라서 일광 절약 시간제가 적용된다.

        final String asiaSeoul = "Asia/Seoul";

        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);   // nowZdt = 2024-08-27T10:58:01.389261200+09:00[Asia/Seoul]

        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of(asiaSeoul));   //arg1: LocalDateTime, arg2: ZoneId
        System.out.println("zdt1 = " + zdt1);       // zdt1 = 2024-08-27T11:00:52.109362100+09:00[Asia/Seoul]

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of(asiaSeoul));
        System.out.println("zdt2 = " + zdt2);       // zdt2 = 2030-01-01T13:30:50+09:00[Asia/Seoul]

         ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));     // 타임존을 변경(서울->영국)
        System.out.println("utcZdt = " + utcZdt);  // utcZdt = 2030-01-01T04:30:50Z[UTC]
    }
}
