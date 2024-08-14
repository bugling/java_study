package self.enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());          // class BASIC = class self.enumeration.ex3.Grade
        System.out.println("class GOLD = " + Grade.GOLD.getClass());            // class GOLD = class self.enumeration.ex3.Grade
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());      // class DIAMOND = class self.enumeration.ex3.Grade

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));             // ref BASIC = 1d81eb93
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));               // ref GOLD = 7291c18f
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));         // ref DIAMOND = 34a245ab

        // 실행 결과를 보면 상수들이 열거형으로 선언한 타입인 Grade 타입을 사용하고,
        // 각각의 인스턴스가 서로 다른 것을(다른 참조값) 알 수 있다.
    }

    // ENUM에서 toString을 재정의 했기 때문에, 참조값을 확인하는 메서드를 구현함.
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
