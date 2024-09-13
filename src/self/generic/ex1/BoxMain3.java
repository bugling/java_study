package self.generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<Integer>();     // 생성 시점에 T의 타입 결정
        integerBox.set(10);
        //integerBox.set("문자100");      컴파일 오류 발생!
        Integer integer = integerBox.get();     // Integer 타입 반환(캐스팅 X)
        System.out.println("integer = " + integer);     // integer = 10

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        //stringBox.set(100);           컴파일 오류 발생!
        String str = stringBox.get();
        System.out.println("str = " + str);         // str = hello


        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론: 생성하는 제너릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();   // 생성자에서는 타입을 명시하지 않아도, 참조하는 부분(선언부)에 명시되어 있기 때문에 Integer타입임을 알 수 있음.
        
        // GenericBox<String>, Generic<Integer>와 같은 코드가 실제로 만들어지는 것은 아니다.
        // 대신에 자바 컴파일러가 우리가 입력한 타입 정보를 기반으로 이런 코드가 있다고 가정하고 컴파일 과정에 타입 정보를 반영한다.
        // 이 과정에서 타입이 맞지 않으면 컴파일 오류가 발생한다.
    }
}
