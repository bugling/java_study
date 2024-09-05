package self.exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        } finally {
            // 명시하지 않은 에러를 catch하지 못하더라도 무조건 실행 -> 리소스 반환 문제 해결
            client.disconnect();
        }

    }
}
