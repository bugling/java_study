package self.enumeration.ref3;

public class EnumRefMain3_4 {
    public static void main(String[] args) {
        int price = 10000;

        // 새로운 등급이 추가되더라도 모든 등급이 출력되도록 리팩토링함.
        Grade[] values = Grade.values();
        for(Grade value : values){
            printDiscount(value, price);
        }

        // 실행 결과
        /**
         * BASIC : 1000
         * GOLD : 2000
         * DIAMOND : 3000
         * VIP : 4000           <- 추가된 항목
         * **/
    }

    // 중복된 로직을 하나의 메서드로 만들어서 호출 시키도록 함.
    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " : " + grade.discount(price));
    }
}
