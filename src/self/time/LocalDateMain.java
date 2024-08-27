package self.time;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜 = " + nowDate);        // 오늘 날짜 = 2024-08-27
        System.out.println("지정된 날짜 = " + ofDate);       // 지정된 날짜 = 2013-11-21

        // 계산(불변)   -> 변경이 발생하는 경우 새로운 객체를 생성해서 반환하므로 반환값을 받아야 한다.
        LocalDate ofDatePlus = ofDate.plusDays(10);
        System.out.println("지정된 날짜 + 10d = "+ ofDatePlus);        // 지정된 날짜 + 10d = 2013-12-01
    }
}
