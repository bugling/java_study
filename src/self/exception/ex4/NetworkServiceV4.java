package self.exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);

        client.initError(data);
    
        // catch 부분을 공통 로직으로 이관시킴(MainV4)
        try {
            client.connect();
            client.send(data);
        } finally {
            // 명시하지 않은 에러를 catch하지 못하더라도 무조건 실행 -> 리소스 반환 문제 해결
            client.disconnect();
        }

    }
}
