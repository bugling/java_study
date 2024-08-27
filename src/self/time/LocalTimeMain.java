package self.time;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime =LocalTime.of(1, 1, 1);

        System.out.println("지금 시간 = " + nowTime);               // 지금 시간 = 09:48:19.161307500
        System.out.println("지정된 시간 = "+ ofTime);                // 지정된 시간 = 01:01:01

        // 계산(불변)   -> 변경이 발생하는 경우 새로운 객체를 생성해서 반환하므로 반환값을 받아야 한다.
        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("지정된 시간 + 30s = " + ofTimePlus);     // 지정된 시간 + 30s = 01:01:31
    }
}
