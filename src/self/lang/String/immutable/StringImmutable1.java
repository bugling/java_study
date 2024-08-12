package self.lang.String.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {

        String str = "hello";
        str.concat(" java");
        System.out.println(str);        // hello

        String str2 = "hello";
        String str3 = str.concat(" java");      // new String("hello java")를 반환
        System.out.println(str3);       // hello java
        
        // String은 불변 객체이다. 따라서 변경이 필요한 경우 기존 값을 변경하지 않고, 대신에 새로운 결과를 만들어서 반환한다.

        // String이 불변으로 설계된 이유!!
        // 문자열 풀에 있는 String 인스턴스의 값이 중간에 변경되면 같은 문자열을 참고하는 다른 변수의 값도 함께 변경된다.
        // String은 자바 내부에서 문자열 풀을 통해 최적화를 한다.
        // 만약 String 내부의 값을 변경할 수 있다면, 기존에 문자열 풀에서 같은 문자를 참조하는 변수의 모든 문자가 함께 변경되어 버리는 문자가 발생한다.
    }
}
