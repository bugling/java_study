package self.lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        // Random random = new Random();
        Random random = new Random(1);      // seed가 같으면 실행 결과도 동일함.ㅠ

        int randomInt = random.nextInt();
        System.out.println("randomInt: " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble: " + randomDouble);  // 0.0d ~ 1.0d

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10);         // 0 ~ 9
        System.out.println("0 ~ 9: " + randomRange1);         // 0 ~ 9: 3

        int randomRange2 = random.nextInt(10) + 1;      // 1 ~ 10
        System.out.println("1 ~ 10: " + randomRange2);         // 1 ~ 10: 3
    }
}
