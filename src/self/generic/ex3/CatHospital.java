package self.generic.test.ex3;

import self.generic.animal.Cat;

public class CatHospital {

    private Cat animal;

    public void set(Cat animal) {
        this.animal = animal;
    }

    // 개의 이름과 사이즈, 울음소리를 출력한다.
    public void checkUp() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 사이즈: " + animal.getSize());
        animal.sound();
    }

    // 다른 개와 비교해서 사이즈가 큰 개를 반환한다.
    public Cat bigger(Cat target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
