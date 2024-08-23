package self.nested.inner.ex1;

// Engine에서만 사용하도록 의도한 클래스
// 하지만 Car와 Engine이 다른 파일로 개발되어 의도를 파악하지 못할 가능성이 있다.
public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    // Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    // Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}
