package self.enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK")
    , BAD_REQUEST(400, "Bad Request")
    , NOT_FOUND(404, "Not Found")
    , INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    int code;
    String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    int getCode(){
        return code;
    }

    String getMessage() {
        return message;
    }

    public static void findMessageByCode(int httpCodeInput) {
        HttpStatus[] values = values();
        boolean isFind = false;
        for(HttpStatus value : values){
            if(value.getCode() == httpCodeInput){
                System.out.println(httpCodeInput + " : " + value.message);
                isFind = true;
                break;
            }
        }

        if(!isFind) System.out.println("존재하지 않는 코드입니다.");
    }
}
