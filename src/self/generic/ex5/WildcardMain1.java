package self.generic.test.ex5;

import self.generic.animal.Animal;
import self.generic.animal.Cat;
import self.generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("명멍이", 100));

        // <Dog> 생략 가능 (타입 추론)

        // Generic 메서드 사용
        WildcardEx.<Dog>printGenericV1(dogBox);                 // T = Animal{name='명멍이', size=100}
        WildcardEx.printAndReturnGeneric(dogBox);               // 이름 = 명멍이
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);     // 이름 = 명멍이

        // Wildcard 메서드 사용
        WildcardEx.printWildcardV1(dogBox);                     // ? = Animal{name='명멍이', size=100}
        WildcardEx.printWildcardV2(dogBox);                     // 이름 = 명멍이
        Animal animal = WildcardEx.printAndReturnWildCard(dogBox);   // 이름 = 명멍이

        /****
         *
         * 제네릭 메서드 실행 예시
        //1. 전달
        printGenericV1(dogBox)
        //2. 제네릭 타입 결정 dogBox는 Box<Dog> 타입, 타입 추론 -> T의 타입은 Dog
        static <T> void printGenericV1(Box<T> box) {
            System.out.println("T = " + box.get());
        }
        //3. 타입 인자 결정
        static <Dog> void printGenericV1(Box<Dog> box) {
            System.out.println("T = " + box.get());
        }
        //4. 최종 실행 메서드
        static void printGenericV1(Box<Dog> box) {
            System.out.println("T = " + box.get());
        }
         **/


        // Box<? extends Animal> 로 제한했기 때문에 다른 타입을 받을 수 없음
        // WildcardEx.printWildcardV2(objBox);
        // WildcardEx.printWildcardV2(new Box<Integer>());

        // Generic과 Wildcard는 기능적으로 거의 비슷하다.
        // 하지만, 입력한 타입을 그대로 반환받아야 하는 상황에서는 Generic을 사용해야 한다.
        // Wildcard 사용시 Dog(자식)를 반환받지 못하고 Animal(부모)이 반환된다.
        // 메서드의 타입들을 특정 시점에 변경하려면 Generic 타입인, 제네릭 메서드를 사용해야 한다.
        // Wildcard는 이미 만들어진 Generic 타입을 전달 받아서 활용할 때 사용한다.
        // 따라서 메서드의 타입들을 타입 인자를 통해 변경할 수 없다.
        // 쉽게 말해서 일반적인 메서드에 사용한다고 생각하면 된다.

        // Generic 타입, 메서드 꼭 필요한 상황이면 <T>를 사용하고, 그렇지 않은 상황이면 Wildcard를 사용하는 것을 권장한다.

    }
}
