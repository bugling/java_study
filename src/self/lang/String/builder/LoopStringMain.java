package self.lang.String.builder;

// 비교적 최신 버전의 java의 경우 StringBuilder를 쓰지 않더라도 String str3 = str1 + str2를 했을 때
// java 내부적으로 String str3 = StringBuilder().append(str1).append(str2).toString()을 수행한다.
// 간단한 문자열 조작을 " + "를 사용해도 충분하다.

public class LoopStringMain {

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        String result = "";
        for(int i=0; i<100000; i++){
            result += "Hello Java ";
        }

        /**
         * << java 내부에서 최적화되어 실행될 때의 코드 >>
         *
         * for(int i=0; i<100000; i++) {
         *      // 반복 횟수만큼 객체 생성 중 ㅠㅠ
         *     result = new StringBuilder().append(result).append("Hello Java ").toString();
         * }
         * **/
        // 반복문의 루프 내부에서는 최적화가 되는 것 처럼 보이지만, 반복 횟수만큼 객체를 생성해야 한다.
        // 반복문 내에서의 문자열 연결은 런타임에 연결할 문자열의 개수와 내용이 결정된다.
        // 이런 경우, 컴파일러는 얼마나 많은 반복이 일어날지, 각 반복에서 문자열이 어떻게 변할지 예측할 수 없다.
        // 따라서 이런 상황에서는 최적화가 어렵다.

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + " ms");      // time = 7236 ms
    }
}
