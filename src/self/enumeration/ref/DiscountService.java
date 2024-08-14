package self.enumeration.ref;


public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {

        // ClassGrade객체가 인자로 넘어오고 BASIC, GOLD, DIAMOND 정보가 들어있음. 개발자가 메서드를 작성할 때 그 내용은 알 필요가 없음.(if문 필요X)
        // getDiscountPercent() 메서드로 각 등급에 맞는 할인율을 꺼냄(10, 20, 30)
        return price * classGrade.getDiscountPercent() / 100;
    }
}
