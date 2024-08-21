package self.nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // NestedOuter과 Nested 클래스는 아무런 관련이 없음. 단지 중첩되어 위치해 있을 뿐!!
    // 단, 장점은 Nested가 NestedOuter의 private에 접근할 수 있음.( 안->밖 (가능) / 밖->안(불가능) )
    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);            // 1

            // 바깥 클래스의 인스턴스 멤버에 접근 -> 컴파일 오류 발생
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
            System.out.println(NestedOuter.outClassValue);      // 3
            // System.out.println(outClassValue);      // 클래스 이름 빼고 변수 이름만 써도 접근 가능
        }
    }
}
