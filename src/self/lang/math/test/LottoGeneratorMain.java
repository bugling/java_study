package self.lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();

        int[] lottoNumbers = lottoGenerator.generator();

        System.out.print("로또 번호 : ");
        for(int i=0; i<lottoNumbers.length; i++) {
            System.out.print(lottoNumbers[i] + "  ");
        }
    }
}
