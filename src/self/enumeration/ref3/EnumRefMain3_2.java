package self.enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        // ENUM에서 바로 할인율을 계산한다.
        // DiscountService파일이 필요 없어진다.
        // 등급별로 할인율이 결정되어 있기 때문
        // -> ENUM도 클래스다!!
        int basic   = Grade.BASIC.discount(price);
        int gold    = Grade.GOLD.discount(price);
        int diamond = Grade.DIAMOND.discount(price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);               // BASIC 등급의 할인 금액 : 1000
        System.out.println("GOLD 등급의 할인 금액 : " + gold);                 // GOLD 등급의 할인 금액 : 2000
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);           // DIAMOND 등급의 할인 금액 : 3000
    }
}
