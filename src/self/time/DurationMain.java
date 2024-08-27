package self.time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);       // duration = PT30M

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        // 계산에 사용
        LocalTime plusTime = lt.plus(duration);
        System.out.println("더한 시간 = " + plusTime);       // 01:30

        // 시간 차이
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);

        Duration gap = Duration.between(start, end);
        System.out.println("차이: " + gap.toHours() + "시간 " + gap.toMinutesPart() + "분 " + gap.toSecondsPart() + "초");   // 차이: 1시간 0분 0초
        System.out.println("차이 초로 환산: " + gap.toSeconds() + "초");      // 차이 초로 환산: 3600초
        System.out.println(gap.toSeconds());
        System.out.println("차이 분으로 환산: " + gap.toMinutes() + "분");     // 차이 분으로 환산: 60분

        LocalTime start2 = LocalTime.of(11, 1, 1);
        LocalTime end2 = LocalTime.of(12, 2, 2);
        Duration gap2 = Duration.between(start2, end2);
        System.out.println("차이2: " + gap2.toHours() + "시간 " + gap2.toMinutesPart() + "분");   // 차이2: 1시간 1분
        System.out.println("차이2 초로 환산: " + gap2.getSeconds() + "초");      // 차이2 초로 환산: 3661초
        System.out.println("차이2 분으로 환산: " + gap2.toMinutes() + "분");     // 차이2 분으로 환산: 61분


    }
}
