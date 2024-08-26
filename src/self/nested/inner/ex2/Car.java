package self.nested.inner.ex2;

import self.nested.inner.ex1.Engine;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();     // 자신을 생성한 바깥 Car 인스턴스를 자동으로 참조한다.
    }

    // 바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때는 바깥 클래스 이름을 생략할 수 있다.
    // ex) new Engine();
    // 바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때 내부 클래스의 인스턴스는 자신을 생성한 바깥 클래스의 인스턴스를 자동으로 참조한다.
    // 여기서 new Engine()로 생성된 Engine 인스턴스는 자신을 생성한 바깥의 Car 인스턴스를 자동으로 참조한다.

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    // Engine을 Car내부에 위치시켜 Car에서만 사용한다는 의도를 명확하게 함
    private class Engine {
        public void start() {

            // 리팩토링 Before
            // Car car = new Car("model Y", 100);
            // System.out.println("충전 레벨 확인" + car.chargeLevel);        혹은 car.getChargeLevel()     // getter메서드도 필요 없어짐
            // System.out.println(car.model + "의 엔진을 구동합니다.");        혹은 car.getModel()

            // 리팩토링 After
            // Car 인스턴스를 생성할 필요 없이 바로 멤버에 접근 가능
            System.out.println("충전 레벨 확인" + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
