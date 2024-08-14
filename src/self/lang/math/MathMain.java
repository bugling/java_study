package self.lang.math;

public class MathMain {

    public static void main(String[] args) {
        
        // 기본 연산 메서드
        System.out.println("max(10, 20) : " + Math.max(10, 20));       // max(10, 20) : 20
        System.out.println("min(10, 20) : " + Math.min(10, 20));       // min(10, 20) : 10
        System.out.println("abs(-10) : "    + Math.abs(-10));          // abs(-10) : 10

        // 반올림 및 정밀도 메서드
        System.out.println("ceil(2.1) : " + Math.ceil(2.1));            // ceil(2.1) : 3.0      (올림)
        System.out.println("floor(2.1) : " + Math.floor(2.1));          // floor(2.1) : 2.0     (내림)
        System.out.println("round(2.5) : " + Math.round(2.5));          // round(2.5) : 3       (반올림)

        // 기타 유용한 메서드
        System.out.println("sqrt(4) : " + Math.sqrt(4));                // sqrt(4) : 2.0        (제곱근)
        System.out.println("random() : " + Math.random());              // 0.0 ~ 1.0 사이의 double 값    (호출 시 마다 다른 값이 나옴)
    }
}
