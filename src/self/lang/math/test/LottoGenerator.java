package self.lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    // 로또 번호 생성 메서드
    public int[] generator() {
        lottoNumbers = new int[6];
        count = 0;

        while(count < 6) {
            // 1부터 45 사이의 숫자 생성
            int number = random.nextInt(45);

            if(isUnique(number)) {
                // 중복되지 않은 경우에만 배열에 추가
                lottoNumbers[count] = number;
                count++;
            }
        }

        return lottoNumbers;
    }

    // 배열 내에서 유니크한 값을 갖는지 확인하는 메서드
    private boolean isUnique(int number) {
        for(int i=0; i<count; i++) {
            if(lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}
