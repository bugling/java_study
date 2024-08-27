package self.time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate;
        for(int i=0; i<5; i++){
            endDate = startDate.plus(2*1, ChronoUnit.MINUTES);
            System.out.println(endDate);
        }
    }
}
