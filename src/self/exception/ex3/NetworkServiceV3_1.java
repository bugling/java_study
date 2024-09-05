package self.exception.ex3;


import self.exception.ex3.exception.ConnectException;
import self.exception.ex3.exception.SendException;

public class NetworkServiceV3_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (ConnectException e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (SendException e) {
            System.out.println("[전송 오류] 전송 메세지: " + e.getSendData() + ", 메세지: " + e.getMessage());
        } finally {
            // 명시하지 않은 에러를 catch하지 못하더라도 무조건 실행 -> 리소스 반환 문제 해결
            client.disconnect();
        }

    }
}
