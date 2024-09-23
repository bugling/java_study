package self.generic.test.ex5;

import self.generic.animal.Animal;

// 제네릭 메서드와 와일드 카드를 비교할 수 있게 같은 기능을 각각 하나씩 배치
// 와일드 카드는 ?를 사용해서 정의한다.
// 와일드 카드는 제네릭 타입이나, 제네릭 메서드를 선언하는 것이 아니다.
// 와일드 카드는 이미 만들어진 제네릭 타입을 활용할 때 사용한다.
public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {     // Box<T>의 T는 Animal 혹은 Animal의 자식 클래스이다.
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {     // Box<T>의 T는 Animal 혹은 Animal의 자식 클래스이다.
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildCard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
