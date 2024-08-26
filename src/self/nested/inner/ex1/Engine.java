package self.nested.inner.ex1;

// Car에서만 사용하는 클래스하도록 의도한 클래스
// 하지만 Car와 Engine이 다른 파일로 개발되어 의도를 파악하지 못할 가능성이 있다.
public class Engine {

    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public void start() {
        System.out.println("충전 레벨 확인: " + car.getChargeLevel());
        System.out.println(car.getModel() + "의 엔진을 구동합니다.");
    }
}
