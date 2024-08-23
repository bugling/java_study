package self.nested;

public class ShadowingMain {
    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;              // 같은 이름(value), 다른 값 1,2,3
            System.out.println("value = " + value);                                     // value = 3                    // go 내부의 변수
            System.out.println("this.value = " + this.value);                           // this.value = 2               // Inner의 멤버
            System.out.println("ShdowingMain.this.value = " + ShadowingMain.this.value); // ShdowingMain.this.value = 1  // 바깥 클래스의 변수

            // 프로그램밍에서 우선순위는 대부분 더 가깝거나, 더 구체적인 것이 우선권을 가진다.
            // 쉽게 이야기해서 사람이 직관적으로 이해하기 쉬운 방향으로 우선순위를 설계한다.

            // 메서드 go()의 경우 지역 변수인 value가 가장 가깝다. 따라서 우선순위가 가장 높다.
            // 이렇게 다른 변수들을 가려서 보이지 않게 하는 것을 섀도잉(Shadowing)이라 한다.

            // 다른 변수를 가리더라도 인스턴스의 참조를 사용하면 외부 변수에 접근할 수 있다.
            // this.value는 내부 클래스의 인스턴스에 접근하고, 바깥클래스이름.this는 바깥 클래스의 인스턴스에 접근할 수 있다.

            // 프로그래밍에서 가장 중요한 것은 명확성이다. 이렇게 이름이 같은 경우 처음부터 이름을 서로 다르게 지어서 명확하게 구분하느 것이 더 나은 방법이다.
        }
    }

    public static void main(String[] args) {
        ShadowingMain shdowingMain = new ShadowingMain();
        ShadowingMain.Inner inner = shdowingMain.new Inner();

        inner.go();
    }
}

