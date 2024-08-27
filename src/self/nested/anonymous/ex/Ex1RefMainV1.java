package self.nested.anonymous.ex;

import java.util.Random;

// 코드 조각을 인자로 넘겨서 코드의 반복성을 줄이는 방법
public class Ex1RefMainV1 {

    // 코드 조각은 보통 메서드에 정의한다. -> 코드 조각을 전달하기 위해서는 메서드가 필요하다.
    // 메서드를 전달하기 위해 인스턴스를 전달하고, 인스터스에 있는 메서드를 호춣면 된다.

    // Process 매개변수를 통해 인서턴스를 전달할 수 있다. 이 인스턴스의 run() 메서드를 실행하면 필요한 코드 조각을 실행할 수 있다.
    // 이때 다형성을 활용해서 외부에서 전달되는 인스턴스에 따라 각각 다른 코드 조각이 실행된다.
    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    static class Dice implements Process {

        @Override
        public void run() {
            int randomValue= new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Sum implements Process {

        @Override
        public void run() {
            for(int i=0; i<3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
       
        // Process를 상속받은 두 객체 생성
        Dice dice = new Dice();
        Sum sum = new Sum();

        // Process를 인자로 받는 메서드를 실행 (Process의 구현체를 넘길 수 있음)
        hello(dice);
        hello(sum);
    }
}
