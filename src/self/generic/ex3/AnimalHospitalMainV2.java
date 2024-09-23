package self.generic.ex3;

import self.generic.animal.Cat;
import self.generic.animal.Dog;

public class AnimalHospitalMainV2 {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHopital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHopital = new AnimalHospitalV2<>();

        // 의도와 다른 데이터 타입을 타입 매개변수로 전달
        AnimalHospitalV2<Integer> integerHopital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHopital = new AnimalHospitalV2<>();
    }
}
