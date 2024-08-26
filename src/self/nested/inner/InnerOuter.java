package self.nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            // 자기 자신에 접근 가능
            System.out.println("Inner의 멤버 : " + innerInstanceValue);

            // 외부 클래스의 인스터스 멤버에 접근 가능       // 물론 private도 접근 가능
            System.out.println("InnerOuter(부모)의 private 멤버 : " + outInstanceValue);

            // 외부 클래스의 클래스 멤버에 접근 가능
            System.out.println("InnerOuter(부모)의 클래스 멤버 : " + outClassValue);
        }
    }
}
