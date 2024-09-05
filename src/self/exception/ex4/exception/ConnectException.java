package self.exception.ex4.exception;

public class ConnectException extends NetworkClientExceptionV4 {

    private final String address;

    public ConnectException(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
