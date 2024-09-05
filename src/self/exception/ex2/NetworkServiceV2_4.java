package self.exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }
        
        // Runtime에러 발생 시 해당 구문은 실행되지 못함 (위에 런타임 에러를 잡는 로직이 없기 떄문) -> 리소스 반환 문제 발생
        client.disconnect();
    }
}
