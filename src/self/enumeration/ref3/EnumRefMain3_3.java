package self.enumeration.ref3;

public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;

        printDiscount(Grade.BASIC, price);      // BASIC : 1000
        printDiscount(Grade.GOLD, price);       // GOLD : 2000
        printDiscount(Grade.DIAMOND, price);    // DIAMOND : 3000
    }

    // 중복된 로직을 하나의 메서드로 만들어서 호출 시키도록 함.
    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " : " + grade.discount(price));
    }
}
