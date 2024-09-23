package self.generic.test.ex3;

import self.generic.animal.Cat;
import self.generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 100);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        //동물 이름: 멍멍이1
        //동물 사이즈: 100
        //멍멍

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        //동물 이름: 야옹이1
        //동물 사이즈: 100
        //냐옹


        // 문제1: 개 병원에 고양이 전달
        // dogHospital.set(cat);        // 컴파일 오류 발생

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));     // Animal -> Dog로 다운 캐스팅
        System.out.println("biggerDog = " + biggerDog);     // biggerDog = Animal{name='멍멍이2', size=200}

        // 타입 매개변수에 입력될 수 있는 상한을지정해서 문제를 해결했다.
        // - AnimalHospitalV3<Integer>와 같이 동물과 전혀 관계없는 타입 인자를 컴파일 시점에 막는다.
        // - 제너릭 클래스 안에서 Animal의 기능을 사용할 수 있다.
        
        // AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>();    ->  컴파일 오류 발생
    }
}
