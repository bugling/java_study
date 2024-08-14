package self.enumeration.ex3;

public class ClassGradeEx3_2 {

    // static 필드의 참조값을 비교해서 로직을 짤 때의 문제점!
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
/*
        // 불가능한 예
        Grade grade = new Grade();                  // enum은 생성 불가능
        int result = discountService.discount(grade, price);

        // 가능한 예시
        int result = discountService.discount(Grade.BASIC, price);
 */
    }
}
