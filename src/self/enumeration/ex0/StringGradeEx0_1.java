package self.enumeration.ex0;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);

        // 오타
        int diamonds = discountService.discount("DIAMONDS", price);

        // 대소문자 실수
        int gold2 = discountService.discount("gold", price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);           // BASIC 등급의 할인 금액 : 1000
        System.out.println("GOLD 등급의 할인 금액 : " + gold);             // GOLD 등급의 할인 금액 : 2000
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);       // DIAMOND 등급의 할인 금액 : 3000
        System.out.println("VIP 등급의 할인 금액 : " + vip);               // VIP : 할인X                        VIP 등급의 할인 금액 : 0
        System.out.println("DIAMONDS 등급의 할인 금액 : " + diamonds);     // DIAMONDS : 할인X                   DIAMONDS 등급의 할인 금액 : 0
        System.out.println("gold 등급의 할인 금액 : " + gold2);            // gold : 할인X                       gold 등급의 할인 금액 : 0

        // 등급에 문자열을 사용하는 방식의 문제점
        // 1. 타입 안정성 부족: 문자열은 오타가 발생하기 쉽고, 유효하지 않은 값이 입력될 수 있다.
        // 2. 데이터 일관성: "GOLD", "gold", "Gold" 등 다양한 형식으로 문자열을 입력할 수 있어 일관성이 떨어진다.
        // 3. 값의 제한 부족: String으로 상태나 카테고리를 표현하면, 잘못된 문자열을 실수로 입력할 수 있다.
        // 4. 컴파일 시 오류 감지 불가: 이런한 잘못된 값은 컴파일 시에는 감지되지 않고, 런타임에서만 문제가 발생하기 때문에 디버깅이 어려워 질 수 있다.

        // -> 이런 문제를 해결하려면 특정 범위로 값을 제한해야 한다.

    }
}
