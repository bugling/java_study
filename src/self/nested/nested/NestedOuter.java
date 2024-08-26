package self.nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버의 접근
            System.out.println("Nested의 private 멤버 : " + nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근할 수 없다.       // static class 이므로 인스턴스 멤버에 접근이 당연히 불가능함
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버(static멤버)에는 접근할 수 있다.
            // private도 접근 가능   // private는 NestedOuter내부에서만 접근 가능한데 Nested도 그 내부에 속해있기 때문
            System.out.println("NestedOuter의 클래스 멤버 : " + NestedOuter.outClassValue);
            // System.out.println(outClassValue);      // 접근자 없이도 접근 가능함
        }
    }

}
