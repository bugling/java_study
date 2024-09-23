package self.generic.ex3;

import self.generic.animal.Cat;
import self.generic.animal.Dog;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

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
        // dogHospital.set(cat);        // 다른 타입 입력: 컴파일 오류

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);     // biggerDog = Animal{name='멍멍이2', size=200}
    }
}
