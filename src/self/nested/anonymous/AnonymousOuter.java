package self.nested.anonymous;

import self.nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {

        int localVar = 1;

        // 익명 클래스는 클래스의 본문(body)을 정의하면서 동시에 생성한다.
        // new 다음에 바로 상속 받으면서 구현 할 부모 타입을 입력하면 된다.
        // 이 코드는 마치 인터페이스 Printer를 생성하는 것 처럼 보이지만, 자바에서 인터페이스를 생성하는 것은 불가능.
        // 이 코드에서 Printer 인터페이스를 구현한 코드를 작성하면 된다.
        // 이 부분에서 바로 익명 클래스의 본문이 된다.
        // -> Printer를 상속(구현)하면서 바로 생서하는 것이다.

        // 익명 클래스의 특징
        // - 익명 클래스는 이름 없는 지역 클래스를 선언하면서 동시에 생한한다.
        // - 익명 클래스는 부모 클래스를 상속 받거나, 또는 인터페이스를 구현해야 한다. 익명 클래스를 사용할 때는 상위 클래스나 인터페이스가 필요하다.
        // - 익명 클래스는 말 그대로 이름이 없다. 이름을 가지지 않으므로, 생성자를 가질 수 없다. (기본 생성자만 사용함)
        // - 익명 클래스는 AnonymouseOuter$1과 같이 자바 내부에서 '바깥 클래스 이름 + $ + 숫자'로 정의된다. 익명 클래스가 여러개면 $1, $2, $3으로 숫자가 증가하면서 구분된다.

        // 익명 클래스의 장점
        // 익명 클래스를 사용하면 클래스를 별도로 정의하지 않고도 인터페이스나 추상 클래스를 즉석으로 구현할 수 있어 코드가 더 간결해진다.
        // 하지만 복작하거나 재사용이 필요한 경우에는 별도의 클래스를 정의하는 것이 좋다.

        // 정리
        // 익명 클래스는 이름이 없는 지역 클래스이다.
        // 특정 부모 클래스(인터페이스)를 상속 받고 바로 생성하는 경우 사용한다.
        // 지역 클래스가 일회성으로 사용되는 경우나 간단한 구현을 제공할 때 사용한다.
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);                       // value=0
                System.out.println("localVar=" + localVar);                 // localVar=1
                System.out.println("paramVar=" + paramVar);                 // outInstanceVar=3
                System.out.println("outInstanceVar=" + outInstanceVar);     // printer.class=class nested.anonymous.AnonymousOuter$1
            }
        };

        printer.print();
        System.out.println("printer.class=" + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}