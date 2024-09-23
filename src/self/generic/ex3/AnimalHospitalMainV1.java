package self.generic.ex3;

import self.generic.animal.Cat;
import self.generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

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
        dogHospital.set(cat);        // 매개변수 체크 실패: 컴파일 오류 발생하지 않음.

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));     // Animal -> Dog로 다운 캐스팅 
        System.out.println("biggerDog = " + biggerDog);     // biggerDog = Animal{name='멍멍이2', size=200}
    }
}
