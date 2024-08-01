package self.lang.object.toString;

public class ObjectPrint {
    
    // ObjectPrint.print(인자) 형식으로 사용 가능한 클래스

    // 인자로 Object 형식을 받는 이유??
    //      -> Object는 모든 클래스의 부모 클래스 -> 모든 형식을 다 담을 수 있는 '만능 통' 역할을 수행할 수 있음.(다형적 참조)
    // obj.toString()을 쓰면 무조건 물리적 주소만 출력되지 않는가?
    //      -> No!!     인자로 들어온 객체의 타입에 따라 재정의된 toString이 먼저 호출되고, 재정의 되지 않았다면 원래의 Object.toString()이 호출됨.

    // 이를 " 추상적인 것에 의존한다 " 라고 말함.
    // 장점?
    //      -> 모든 클래스는 Object를 상속받기 때문에 Object 형식의 변수에 담길 수 있음.
    //      -> print 메서드 하나로 모든 클래스에 사용 가능함.
    //      -> dogPrint, carPrint...를 만들 필요가 없어짐.

    /**
     * < OCP 원칙 >
     * Open-Closed Principal(개방-패쇄의 원리)
     *
     * - Open: 새로운 클래스를 추가하고, toStirng()을 오버라이딩해서 기능을 확장할 수 있다.
     * - Closed: 새로운 클래스를 추가해도 Object와 toString()을 사용하는 클라이언트 코드인 ObjectPrinter는 변경하지 않아도 된다.
     * **/

    public static void print(Object obj){                   // Object 클래스를 정적으로 의존(눈에 보이게 사용)
        String string = "객체 정보 출력 : " + obj.toString(); // Dog와 Car를 동적으로 의존(runtime 시 toStirng이 정의된 클래스를 선택하여 사용)
                                                            // 의존 == 사용     **앞에 수식어가 없을 시 의존은 '정적인 의존'을 의미함!
        System.out.println(string);
    }

}
