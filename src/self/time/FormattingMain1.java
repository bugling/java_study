package self.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {

    public static void main(String[] args) {
        
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);       // date = 2024-12-31

        // DateTimeFormatter객체를 반환시켜서 포맷팅 객체 생성
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

        System.out.println("formatter = " + formatter);     // formatter = Value(YearOfEra,4,19,EXCEEDS_PAD)'년'' 'Value(MonthOfYear,2)'월'' 'Value(DayOfMonth,2)'일'

        // 포맷팅: 날짜를 문자로, Date -> String
        String formattedDate = date.format(formatter);
        System.out.println("날짜와 시간 포맷팅 = " + formattedDate);        // 날짜와 시간 포맷팅 = 2024년 12월 31일

        // 파싱: 문자를 날짜로 변경, String -> Date
        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("parsedDate = " + parsedDate);               // parsedDate = 2030-01-01
    }
}
