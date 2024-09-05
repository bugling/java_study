package self.exception.ex4.exception;

public class SendException extends NetworkClientExceptionV4 {

    private final String sendData;

    public SendException(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
