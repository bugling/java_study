package self.generic.test.ex4;

import self.generic.animal.Animal;

public class ComplexBox<T extends Animal> { // 제네릭 클래스 소속 T

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public <Z> Z pritAndReturn(Z z){
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + z.getClass().getName());
        return z;
    }

    // 메서드 내부의 T는 타입 매개변수 T와 아무 관련이 없음
    public <T> T pritAndReturn2(T t){       // T: 제네릭 메서드 소속
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }

}
