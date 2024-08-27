package self.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();        // 년, 월, 일만 존재하는 객체
        System.out.println("SECOND_OF_MINUTE = " + now.get(ChronoField.SECOND_OF_MINUTE));        // Unsupported field: SecondOfMinute
    }
}
