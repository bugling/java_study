package self.lang.String.equals;

public class StringEqualsMain1 {

    public static void main(String[] args){
        String str1 = new String("hello");      //x001
        String str2 = new String("hello");      //x002      // 다른 참조값에 다른 인스턴스가 생성

        System.out.println("new String() == 비교 : " + (str1 == str2));           // new String() == 비교 : false
        System.out.println("new String() equals 비교 : " + (str1.equals(str2)));  // new String() equals 비교 : true

        String str3 = "hello";      //x003
        String str4 = "hello";      //x004(x)       x003(o)

        // String str = "hello"와 같이 문자열 리터를을 사용하는 경우 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다.
        // 자바가 실행되는 시점에 클래스에 무자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만들어준다. 이때 같ㅇ느 무자열이 있으면 만들지 않는다.
        // String str3 = "hello"와 같이 문자열을 사용하면 문자열 풀에서 "hello"라는 문자를 가진 String 인스턴스를 찾는다. 그리고 찾은 인스턴스의  참조(x003)를 반환한다.
        // String str4 = "hello"의 경우 "hello" 문자열 리터를을 사용하므로 문자열 풀에서 str3과 같은 x003 참조를 사용한다.
        // 문자열 풀 덕분에 같은 문자를 사용하는 경우 메모리 사용을 줄이고 문자를 만드는 시간도 줄어들기 때문에 성능도 최적화 할 수 있다.

        System.out.println("리터럴 == 비교 : " + (str3 == str4));           // 리터럴 == 비교 : true
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));  // 리터럴 equals 비교 : true

    }
}
