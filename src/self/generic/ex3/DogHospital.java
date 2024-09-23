package self.generic.ex3;

import self.generic.animal.Dog;

public class DogHospital {

    private Dog animal;

    public void set(Dog animal) {
        this.animal = animal;
    }

    // 개의 이름과 사이즈, 울음소리를 출력한다.
    public void checkUp() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 사이즈: " + animal.getSize());
        animal.sound();
    }

    // 다른 개와 비교해서 사이즈가 큰 개를 반환한다.
    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
