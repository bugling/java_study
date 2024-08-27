package self.nested.anoymous.ex;

import java.util.Random;

// 코드 조각을 인자로 넘겨서 코드의 반복성을 줄이는 방법
public class Ex1RefMainV5 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        
        // lamba 표현식으로 코드블럭을 직접 인자로 넘김(java 8 이후 버전만 가능)
        // java 8 이전버전에서는 익명 클래스를 구현해서 인자로 넘김
        // hello메서드는 Process만 인자로 받지만, lamba 표현식의 코드블럭도 정상적으로 실행됨.
        hello(() -> {
                int randomValue= new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
        });
        
        hello(() -> {
                for(int i=0; i<3; i++) {
                    System.out.println("i = " + i);
                }
        });
    }
}
