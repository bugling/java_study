package self.exception.basic.unchecked;

public class UncheckedCatchMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");

        // 예외 처리, message=ex
        // 정상 로직
        // 정상 종료
    }
}
