package self.enumeration.ex1;

import self.enumeration.ex1.DiscountService;

public class StringGradeEx_1 {
    public static void main(String[] args) {

        int price = 10000;
        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);           // BASIC 등급의 할인 금액 : 1000
        System.out.println("GOLD 등급의 할인 금액 : " + gold);             // GOLD 등급의 할인 금액 : 2000
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);       // DIAMOND 등급의 할인 금액 : 3000

        // 장점:
        // static으로 선언하지 않은 등급을 쓴다면 컴파일 오류가 발생함.
        // -> 선언하지 않은 등급을 사용할 수 없음

        // 단점:
        // int basic = discountService.discount(StringGrade.BASIC, price); 에서 StringGrade의 static final 멤버를 사용해야 하는지 모든 개발자는 알기 어렵다.
        // -> discount 메서드에 주석을 달아야 하는 수고가 발생한다.
        // -> 근본적인 해결법은 아니다.

        // 해결법:
        // discount에서 등급을 인자로 받을 때 String으로 받으면 안된다.
        // -> 타입 안정 열거형 패턴 (Enum)을 사용하자!!
    }
}
