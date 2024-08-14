package self.enumeration.ex2;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade();        // x001
    public static final ClassGrade GOLD = new ClassGrade();         // x002
    public static final ClassGrade DIAMOND = new ClassGrade();      // x003
    
    // private 생성자 추가
    // 외부에서 ClassGrade를 생성하지 못하게 막는 역할
    // 만약 인스턴스를 생성한다면 컴파일 오류 발생함.
    // discount 메서드 사용 시 ClassGrade를 생성하지 않고 static 변수를 사용하게끔 유도한다.
    private ClassGrade(){}

    // -> 타입 안전 열겨형 태편(Type-Safe Enum Pattern) 완성!!
    // 장점
    // - 타입 안정성 향상: 정해진 객체만 사용할 수 있기 때문에, 잘못된 갓을 입력하는 문제를 근본적으로 방지
    // - 데이터 일관성: 정해진 객체만 사용하므로 데이터의 일관성이 보장된다.
    // - 제한된 인스턴스 생성: 클래스는 사전에 정의된 몇 개의 인스턴스만 생성하고, 외부에서는 이 인스턴스들만 사용할 수 있도록 한다.
    //      이를 통해 미리 정의된 값들만 사용하도록 보장한다. (내부에서 생성된 ClassGrade를 public으로 선언함.)
    // - 타입 안정성: 이 패턴을 사용하면, 잘못된 값이 할당되거나 사용되는 것을 컴파일 시점에 방지할 수 있다.
    //      예를 들어, 특정 메서드가 특정 열거형 타입의 값을 요구한다면, 오직 그 타입의 인스턴스만 전달할 수 있다.
    //      여기서는 메서드의 매개변수롤 ClassGrade를 사용하는 경우, 앞서 열거한 BASIC, GOLD, DIAMOND만 사용할 수 있다.

    // 단점
    // 이 패턴을 구현하려면 많은 코드를 작성해야 한다. 그리고 private 생성자를 추가하는 등 유의해야 하는 부분들도 있다.
}
