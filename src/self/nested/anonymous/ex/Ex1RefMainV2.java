package self.nested.anonymous.ex;

import java.util.Random;

// 코드 조각을 인자로 넘겨서 코드의 반복성을 줄이는 방법
public class Ex1RefMainV2 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        // 외부에 있는 클래스(Dice, Sum)을 main메서드 내부에서 정의함(내부 클래스 Inner Class)
        class Dice implements Process {
            @Override
            public void run() {
                int randomValue= new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        }

        class Sum implements Process {
            @Override
            public void run() {
                for(int i=0; i<3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        Dice dice = new Dice();
        Sum sum = new Sum();

        // Process를 인자로 받는 메서드를 실행 (Process의 구현체를 넘길 수 있음)
        hello(dice);
        hello(sum);
    }
}
