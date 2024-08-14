package self.enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("에러코드를 입력하십시오.");
        int httpCodeInput = scanner.nextInt();

        HttpStatus.findMessageByCode(httpCodeInput);
    }
}
