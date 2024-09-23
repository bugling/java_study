package self.generic.test.ex4;

import self.generic.animal.Cat;
import self.generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        // public <Z> Z pritAndReturn(Z z)
        Cat returnCat = hospital.<Cat>pritAndReturn(cat);       // hospital 내부의 T는 Dog타입이지만, 제너릭 메서드<Z>를 사용하여 Cat을 매개변수롤 전달함.
        System.out.println("returnCat = " + returnCat);         // returnCat = Animal{name='야옹이', size=50}

        // public <T> T pritAndReturn2(T t)
        // T는 이미 Dog으로 지정했지만, Cat을 T에 타입 매개변수로 전달한 상황!
        Cat returnCat2 = hospital.<Cat>pritAndReturn(cat);       // 컴파일 오류도 안나고, 정상적으로 작동함
        System.out.println("returnCat2 = " + returnCat);         // returnCat = Animal{name='야옹이', size=50}

        // 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가지기 때문
        // 따라서 printAndReturn2()은 제네릭 타입과는 무관하고 제네릭 메서드가 적용된다.

        // 여기서 적용된 제네릭 메서드의 타입 매개변수 T는 상한이 없다. 따라서 Object로 취급된다.
        // Object로 취급되기 때문에 t.getName()과 같은 Animal에 존재하는 메서드는 호출될 수 없다.

        // 참고로 프로그래밍에서 이렇게 모호한 것은 좋지 않다.
        // 둘의 이름이 겹치면 다음과 같이 둘 중 하나를 다른 이름으로 변경하는 것이 좋다.
    }
}