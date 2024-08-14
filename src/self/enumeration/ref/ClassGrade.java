package self.enumeration.ref;

public class ClassGrade {

    // 등급별로 객체 생성 시 할인율을 다르게 적용함
    // 생성자를 통해서만 discountPercent를 설정하도록 헀고, 중간에 이 값이 변하지 않도록 불변으로 설계했다.
    // -> 상수를 정의할 때 각각의 등급에 따른 할인율(discountPercent)이 정해졌다.
    public static final ClassGrade BASIC = new ClassGrade(10);        // x001
    public static final ClassGrade GOLD = new ClassGrade(20);         // x002
    public static final ClassGrade DIAMOND = new ClassGrade(30);      // x003

    private final int discountPercent;          // ClassGrade에서 할인율을 관리하도록 필드를 추가

    private ClassGrade(int discountPercent){    // 인스턴스를 생성할 때 할인율을 넣도록 강제함
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
