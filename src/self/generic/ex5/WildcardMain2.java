package self.generic.test.ex5;

import self.generic.animal.Animal;
import self.generic.animal.Cat;
import self.generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능 ( = 하한이 Animal )
        writeBox(objBox);
        writeBox(animalBox);

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);       // animal = Animal{name='멍멍이', size=100}

        Object obj = objBox.get();
        System.out.println("obj = " + obj);             // obj = Animal{name='멍멍이', size=100}

        // Animal 하위 타입 전달 불가능
        // writeBox(dogBox);    // 컴파일 오류 발생
        // writeBox(catBox);
    }

    // 하한을 Animal로 지정 ( Wildcard에만 지정 가능 )
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
