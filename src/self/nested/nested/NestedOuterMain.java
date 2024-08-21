package self.nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();       // 외부 클래스.중첩 클래스 형식으로 작성해야 함.
        nested.print();     // 1 \n 3

                        // 외부클래스&중첩클래스로 구분함
        System.out.println("nestedClass = " + nested.getClass());       // nestedClass = class self.nested.nested.NestedOuter$Nested
    }
}
