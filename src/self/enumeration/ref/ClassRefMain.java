package self.enumeration.ref;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());         // class BASIC = class self.enumeration.ex2.ClassGrade
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());           // class GOLD = class self.enumeration.ex2.ClassGrade
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());     // class DIAMOND = class self.enumeration.ex2.ClassGrade
        // -> 각각의 상수는 모두 ClassGrade 타입을 기반으로 인스턴스를 만들었기 때문에, getClass()의 결과는 모두 ClassGrade 이다.

        System.out.println("ref BASIC = " + ClassGrade.BASIC);          // ref BASIC = self.enumeration.ex2.ClassGrade@1d81eb93
        System.out.println("ref GOLD = " + ClassGrade.GOLD);            // ref GOLD = self.enumeration.ex2.ClassGrade@7291c18f
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);      // ref DIAMOND = self.enumeration.ex2.ClassGrade@34a245ab
        // 각각의 상수는 모두 서로 다른 ClassGrade 인스턴스를 참조하기 때문에 참조값이 다르게 출력된다.
    }
}
