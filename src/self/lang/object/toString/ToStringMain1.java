package self.lang.object.toString;

public class ToStringMain1 {
    public static void main(String args[]){
        Object object = new Object();
        String string = object.toString();

        // toString() 변환값 출력
        System.out.println(string);         // 실행결과: java.lang.Object@b4c966a

        // object 직접 출력
        System.out.println(object);         // 실행결과: java.lang.Object@b4c966a
        
        // 두 결과 동일하며, " 객체의_정보@물리적_주소 " 형식으로 출력되었음 ㅠㅠ
        
        // println의 인자로 object와 string을 각각 넣었을 때 결과가 동일한 이유???
        //      -> println의 내부에서 toString() ( 문자로 변환 )하는 로직이 포함되어 있기 때문!!!
        // 객체 내부의 정보를 보고 싶을 때는??
        //      -> 클래스 내부에서 toString()을 오버라이딩하여 재정의 해야함!
        //      -> Dog 클래스 파일 참조 바람.

    }
}
