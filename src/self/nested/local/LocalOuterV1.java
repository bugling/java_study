package self.nested.local;

// 가장 바깥 클래스 
public class LocalOuterV1 {

    private int outInstanceVar = 3;

    // 가장 바깥 클래스 -> 메서드
    public void process(int paramVar) {
        int localVal = 1;

        // 가장 바깥 클래스 -> 메서드 -> 클래스
        class LocalPrinter {            // private class LocalPrinter(불가능)  // 지역 클래스는 지역 변수처럼 접근 제어자를 사용할 수 없다!
            int value = 0;

            // 가장 바깥 클래스 -> 메서드 -> 클래스 -> 메서드
            public void printData() {
                System.out.println("value = " + value);                     // 가장 안쪽 메서드(접근시도) -> 클래스(접근 가능) -> 메서드 -> 가장 바깥 클래스
                System.out.println("localVal = " + localVal);               // 가장 안쪽 메서드(접근시도) -> 클래스 -> 메서드(접근 가능)-> 가장 바깥 클래스
                System.out.println("paramVal = " + paramVar);               // 가장 안쪽 메서드(접근시도) -> 클래스 -> 메서드(파라미터 접근 가능)-> 가장 바깥 클래스
                System.out.println("outInstanceVal = " + outInstanceVar);   // 가장 안쪽 메서드(접근시도) -> 클래스 -> 메서드 -> 가장 바깥 클래스(접근 가능)

                // 클래스의 가장 안쪽에서 가장 바깥쪽까지 접근이 가능했다.
                // 지역 클래스도 내부 클래스의 한 종류이기 떄문이다.

            }
        }
    }


}
