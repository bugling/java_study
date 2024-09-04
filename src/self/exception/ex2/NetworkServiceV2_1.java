package self.exception.ex2;

import exception.ex2.NetworkClientExceptionV2;
import exception.ex2.NetworkClientV2;

public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        exception.ex2.NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
