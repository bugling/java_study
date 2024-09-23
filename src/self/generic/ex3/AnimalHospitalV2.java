package self.generic.test.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없음. Object의 기능만 사용
        animal.toString();
        animal.equals(null);

        // Animal에서 정의한 기능은 사용하지 못함(컴파일 오류)
        // System.out.println("동물 이름: " + animal.getName());
        // System.out.println("동물 사이즈: " + animal.getSize());
        // animal.sound();
    }

    public T bigger(T target) {
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
