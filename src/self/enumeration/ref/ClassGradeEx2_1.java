package self.enumeration.ref;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);      // ClassGrade.BASIC은 이미 10이라는 값을 가지고 있음
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);               // BASIC 등급의 할인 금액 : 1000
        System.out.println("GOLD 등급의 할인 금액 : " + gold);                 // GOLD 등급의 할인 금액 : 2000
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);           // DIAMOND 등급의 할인 금액 : 3000
    }
}
