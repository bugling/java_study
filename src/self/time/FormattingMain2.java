package self.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        // 포맷팅: 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("날짜와 시간 포맷팅 전: " + now);                   // 날짜와 시간 포맷팅 전: 2024-12-31T13:30:59
        System.out.println("날짜와 시간 포맷팅 후: " + formattedDateTime);     // 날짜와 시간 포맷팅 후: 2024-12-31 13:30:59

        // 파싱: 문자를 날짜와 시간으로
        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자열 파싱 후 날짜와 시간: " + parsedDateTime);       // 문자열 파싱 후 날짜와 시간: 2030-01-01T11:30

    }
}
