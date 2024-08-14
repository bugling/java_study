package self.enumeration.ex3;

import static enumeration.ex3.Grade.*;      // 해당 import가 없으면 Grade.BASIC, Grade.GOLD, Grade.DIAMOND 와 같이 코드를 작성해야 함.

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        if(grade.equals(BASIC)) {           // 가독성을 위해서 Grade.BASIC 와 같이 사용하는 것도 좋은 방법임
            discountPercent = 10;
        }else if(grade.equals(GOLD)) {
            discountPercent = 20;
        }else if(grade.equals(DIAMOND)) {
            discountPercent = 30;
        }else {
            System.out.println("할인X");
        }

        return price * discountPercent / 100;
    }
}
