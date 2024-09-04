package self.enumeration.ex3;

public enum Grade {         // extends ENUM 이 숨어있음
    BASIC, GOLD, DIAMOND;

    // toString 오버라이딩해서 사용 가능(재정의 가능)
    @Override
    public String toString() {
        return super.toString();
    }
}

// 열거형(ENUM)의 장점
// - 타입 안정성 향상: 열거형은 사전에 정의된 상수들로만 구성되므로, 유효하지 않은 값이 입력된 가능성이 없다.
//  이런 경우 컴파일 오류가 발생한다.
// - 간결성 및 일관성 향상: 열거형을 사용하면 코드가 더욱 간결하고 명확해지며, 데이터의 일관성이 보장된다.
// - 확장성: 새로운 회원등급 타입을 추가하고 싶을 때, ENUM에 새로운 상수를 추가하기만 하면 된다.
