package self.enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] grades = Grade.values();
        System.out.println(grades);     // [Lself.enumeration.ex3.Grade;@2f4d3709

        System.out.println(Arrays.toString(grades));    // [BASIC, GOLD, DIAMOND]

        for(Grade g : grades) {
            System.out.println("name=" + g.name()                   // 이름
                                + ", ordinal=" + g.ordinal());      // 순서

            // ordinal 사용을 자제해야 하는 이유
            // 언제 ENUM 항목이 추가될지 모른다.
            // ENUM 항목은 DB에서 공통코드 등으로 따로 저장하고 있을 확률이 크고 (순서도 테이블의 컬럼으로 관리 중,,,),
            // ENUM에는 추가됐는데 DB에는 추가되지 않았을 수 있다.
            // 이 때 무시무시한 에러가 발생할 수 있다. 그러니까 ordinal 사용은 자제하자ㅎㅎ
        }
        /*
        name=BASIC, ordinal=0
        name=GOLD, ordinal=1
        name=DIAMOND, ordinal=2
        */

        // String -> ENUM 변환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);       // gold = GOLD

        // 잘못된 ENUM을 valueOf의 인자로 전달
        input = "gold";
        gold = Grade.valueOf(input);            // java.lang.IllegalArgumentException: No enum constant self.enumeration.ex3.Grade.gold
        System.out.println("gold = " + gold);   // 실행 실패
    }
}
