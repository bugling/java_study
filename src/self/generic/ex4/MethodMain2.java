package self.generic.test.ex4;

import self.generic.animal.Cat;
import self.generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야용이", 100);

        AnimalMethod.<Dog>checkUp(dog);     // <Dog> 생략가능
        AnimalMethod.<Cat>checkUp(cat);     // <Cat> 생략가능

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog biggerDog = AnimalMethod.<Dog>bigger(dog, targetDog);   // <Dog> 생략 가능
        System.out.println("biggerDog = " + biggerDog);             // biggerDog = Animal{name='큰 멍멍이', size=200}
    }
}
