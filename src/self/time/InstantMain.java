package self.time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // Epoch 시간
        // Epoch time(에포크 시간), 또는 Unix timestamp는 컴퓨터 시스템에서 시간을 나타내는 방법 중 하나.
        // 1970년 1월 1일 00:00:00 UTC부터 현재까지 경과된 시간을 초 단위로 표현한 것.
        // 즉, Unix시간은 1970년 1월 1일 이후로 경과한 전체 초의 수로, 시간대에 영향을 받지 않는 절대적인 시간 표현 방법이다.
        // 참고로 Epoch라는 뜻은 어떤 중요한 사건이 발생한 시점을 기준으로 삼는 시작점을 뜻하는 용어다.
        // Instatnt는 바로 Epoch시간을 다루는 클래스이다.

        Instant now = Instant.now();
        System.out.println("now = " + now);                     // now = 2024-08-27T04:20:40.824092400Z

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);                   // from = 2024-08-27T04:21:41.876532400Z

        Instant epochStart = Instant.ofEpochSecond(0);          // 1970년 1월 1일 0시 0분 0초에서 경과한 초 후의 시간을 반환
        System.out.println("epochStart = " + epochStart);       // epochStart = 1970-01-01T00:00:00Z

        Instant later = Instant.ofEpochSecond(3600);        // 1970년 1월 1일 0시 0분 0초에서 경과한 초 후의 시간을 반환
        System.out.println("later = " + later);             // later = 1970-01-01T01:00:00Z

        long laterEpochSecond = later.getEpochSecond();     // 기준시간에서 경과한 초 단위 시간을 반환
        System.out.println("laterEpochSecond = " + laterEpochSecond);       // laterEpochSecond = 3600
    }
}
