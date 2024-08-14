package self.lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);    // 빨간줄 뜨는 이유: 미레에 삭제 예정 ( @Deprecated )
        Integer integerObj = Integer.valueOf(10);   // -128 ~ 127 자주 사용하는 숫자 값 재사용(미리 pool 만들고 필요할 때 값을 빼서 씀)
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        // Integer, Long 내부에서 toString이 오버라이딩되어 바로 값을 출력할 수 있음!
        System.out.println("newInteger = " + newInteger);       // newInteger = 10
        System.out.println("integerObj = " + integerObj);       // integerObj = 10
        System.out.println("longObj = " + longObj);             // longObj = 100
        System.out.println("doubleObj = " + doubleObj);         // doubleObj = 10.5

        System.out.println();

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);           // intValue = 10
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);         // longValue = 100
    }
}
