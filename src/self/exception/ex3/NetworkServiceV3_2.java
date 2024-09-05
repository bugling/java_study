package self.exception.ex3;


import self.exception.ex3.exception.ConnectException;
import self.exception.ex3.exception.NetworkClientExceptionV3;
import self.exception.ex3.exception.SendException;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (ConnectException e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류]" + e.getMessage());
        }finally {
            // 명시하지 않은 에러를 catch하지 못하더라도 무조건 실행 -> 리소스 반환 문제 해결
            client.disconnect();
        }
        
        // ConnectExceptionV3와 NetworkClientExceptionV3의 자리를 바꾸면 컴파일 오류 발생
        // ConnectExceptionV3가 NetworkClientExceptionV3의 자식이기 때문
        // NetworkClientExceptionV3에서 걸렸다면 ConnectExceptionV3도 이미 모두 걸린 후이기 때문에 필요 없는 catch구문이 됨
        // 자식 -> 부모 예외 순으로 작성하도록!

        try {
            client.connect();
            client.send(data);
        } catch (ConnectException | SendException e ) {     // 에러 두 개를 한 번에 처리할 수 있음
            System.out.println("[연결 또는 전송 오류] , 메세지: " + e.getMessage());
            // e.getAddress();
            // e.getSendMessage();      사용 불가능 ㅠㅠ
            // 두 예외의 공통 부모의 메서드만 사용 가능함
        } finally {
            // 명시하지 않은 에러를 catch하지 못하더라도 무조건 실행 -> 리소스 반환 문제 해결
            client.disconnect();
        }

    }
}
