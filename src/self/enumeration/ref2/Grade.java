package self.enumeration.ref2;

public enum Grade {
    // ENUM을 사용 시, discoutnPercent가 자동으로 셋팅됨.
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    // private가 생략된 생성자
    Grade(int discountPercent){
        this.discountPercent = discountPercent;
    }

    // 열거형도 클래스이기 때문에 메서드를 가질 수 있음.
    public int getDiscountPercent() {
        return discountPercent;
    }
}
