package self.enumeration.ex2;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);      // ClassGrade.BASIC : x001
        int gold = discountService.discount(ClassGrade.GOLD, price);        // ClassGrade.GOLD : x002
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);  // ClassGrade.DIAMONDE : x003

        // 참조값을 넘기고 discount 내부에서 같은 참조값인지 확인하는 방식

        System.out.println("BASIC 등급의 할인 금액 : " + basic);               // BASIC 등급의 할인 금액 : 1000
        System.out.println("GOLD 등급의 할인 금액 : " + gold);                 // GOLD 등급의 할인 금액 : 2000
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);           // DIAMOND 등급의 할인 금액 : 3000
    }
}
