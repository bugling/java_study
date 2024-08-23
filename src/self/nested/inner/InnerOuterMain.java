package self.nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
    
        // 문법 정리
        // 부모 클래스로 인스턴스를 생성한다              -> InnerOuter outer = new InnerOuter();
        // outer에서 나온 내부 클래스다 (참조)           -> outer.
        // 새로운 인스턴스다                           -> outer.new
        // 내부 클래스 중에서 Inner로 인스턴스를 만들겠다  -> outer.new Inner()

        // 내부 클래스는 바깥 클래스의 인스턴스에 소속되어 있기 때문에, 바깥 클래스의 인스턴스 정보를 알아야 생성 가능함
        // 정적 중첩(Static Nested) 클래스와의 차이점!
                // 중접(Nested)는 나의 안에 있지만 내 것이 아닌 클래스
                // 내부(Inner)는 내 안에서 나를 구성한느 요소
        // 이름이 InnerClass라고 해서 자식이 부모의 내부에 생성되지 않는다. 단, 자식이 부모의 정보(참조값)를 가진다.
        //  -> 부모의 멤버에 모두 접근 가능해짐
        // 개념적으로는 부모의 내부에 생성된다고 이해하자!

        // 부모 인스턴스 내부에 InnerClass가 생성되기 때문에 각각의 자식을 가질 수 있다.
        /**
         * 각자 다른 InnerOuter 인스턴스 각각의 InnerClass 생성하기
         * InnerOuter outer1 = new InnerOuter();
         * InnerOuter.Inner inner1 = outer1.new Inner();
         *
         * InnerOuter outer2 = new InnerOuter();
         * InnerOuter.Inner inner2 = outer2.new Inner();
         * **/


        inner.print();      // Inner에서 접근 가능한 멤버를 출력함
        // Inner의 멤버 : 1
        // InnerOuter(부모)의 private 멤버 : 2
        // InnerOuter(부모)의 클래스 멤버 : 3

        System.out.println(inner.getClass());
        // class self.nested.inner.InnerOuter$Inner
                                // '부모$자식' 형태로 표현
    }
}
