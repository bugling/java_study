package self.time;

import java.time.ZoneId;

public class ZonedMain {
    public static void main(String[] args) {
        for(String availableZoneId : ZoneId.getAvailableZoneIds()){
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println("zoneId = " + availableZoneId +      
                                " | "+ zoneId.getRules());          // zoneId에 대한 정보(일광 절약 시간 관련 정보, UTC와의 오프셋(차이) 정보를 포함한다.)
            /**
             * zoneId = Asia/Aden | ZoneRules[currentStandardOffset=+03:00]
             * zoneId = America/Cuiaba | ZoneRules[currentStandardOffset=-04:00]
             * zoneId = Etc/GMT+9 | ZoneRules[currentStandardOffset=-09:00]
             * ...
             * zoneId = Europe/Athens | ZoneRules[currentStandardOffset=+02:00]
             * zoneId = US/Pacific | ZoneRules[currentStandardOffset=-08:00]
             * zoneId = Europe/Monaco | ZoneRules[currentStandardOffset=+01:00]
             * **/
        }

        System.out.println();

        // 시스템이 사용하는 기본 ZoneId를 반환한다.   -> 각 PC환경마다 다른 결과가 나올 수 있다.
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);     // ZoneId.systemDefault = Asia/Seoul

        System.out.println();

        // 타임존을 직접 제공해서 ZoneId를 반환한다.
        ZoneId seoulId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulId);              // seoulZoneId = Asia/Seoul
    }
}
