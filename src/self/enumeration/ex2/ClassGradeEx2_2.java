package self.enumeration.ex2;

public class ClassGradeEx2_2 {

    // static 필드의 참조값을 비교해서 로직을 짤 때의 문제점!
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        
/**
        // discount메서드의 사용법을 착각해서 ClassGrade 인스턴스를 생성해서 인자로 넘기는 상황.
        // discountService.discount(ClassGrade.BASIC, price); 같이 static 필드를 사용해야 함!
        // 현재는 ClassGrade에서 private 타입의 생성자를 만들어서 외부에서 ClassGrade 생성 불가능한 상황.
        ClassGrade newClassGrade = new ClassGrade();
        int result = discountService.discount(newClassGrade, price);
**/
    }
}
