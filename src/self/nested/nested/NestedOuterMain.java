package self.nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();       // 특이한 문법
        
        // outer 와 nested는 아무 관련이 없음       
        // 단지 클래스가 중첩되어 있을 뿐
        // nested 클래스 내부에서 outer의 private 멤버 변수에 쉽게 접근할 수 있다는 장점이 있을 뿐임(개발 상의 편의만 존재)
        nested.print();      // Nested에서 접근 가능한 멤버를 출력함
        // Nested의 private 멤버 : 1
        // NestedOuter의 클래스 멤버 : 3

        System.out.println("nestedClass = " +nested.getClass());
        // nestedClass = class self.nested.nested.NestedOuter$Nested
                                                    // '부모$자식' 형태로 표현
    }
}
