package self.nested.inner.ex2;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car("Model Y", 100);
        myCar.start();

        // 충전 레벨 확인100
        // Model Y의 엔진을 구동합니다.
        // Model Y 시작 완료

        /**
         * 중첩 클래스를 사용하는 이유
         * - 논리적 그룹화: 특정 클래스가 다른 하나의 클래스 안에서만 사용되는 경우 해당 클래스 안에 포함하는 것이 논리적으로 더 그룹화된다.
         *                패키지를 열었을 때 달느 곳에서 사용될 필요가 없는 중첩 클래스가 외부에 노출되지 않는 장점도 있다. (Nested의 장점이기도 함)
         * - 캡슐화: 중첩 클래스는 바깥 클래스의 private멤버에 접근할 수 있다.
         *          이렇게 해서 둘을 긴밀하게 연결하고 불필요한 public 메서드를 제거할 수 있다.
         * **/

    }
}
