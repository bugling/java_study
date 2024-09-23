package self.generic.test.ex3;

import self.generic.animal.Animal;

// Animal과 Animal의 자식들만 사용 가능하도록 수정     // 타입 매개변수 제한
public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp() {

        // 타입 매개변수를 제한했기 때문에 컴파일러는 T에 입력될 수 있는 값의 범위를 예측할 수 있다.
        // 타입 매개변수 T에는 타입 인자로 Animal, Dog, Cat만 들어올 수 있다. 따라서 이를 모두 수용할 수 있는 Animal을 T의 타입으로 가정해도 문제가 없다.
        // 따라서 Animal이 제공하는 getName(), getSize() 같은 기능을 사용할 수 있다.
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 사이즈: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
