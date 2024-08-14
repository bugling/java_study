package self.lang.wrapper.test;

public class WrapperTest {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 : " + integer1);

        // Integer -> int
        //int intValue = integer1.intValue();

        // autoBoxing 사용
        int intValue = integer1;

        System.out.println("intValue : " + intValue);

        // int -> Integer
        //Integer integer2 = Integer.valueOf(intValue);

        // autoBoxing 사용
        Integer integer2 = intValue;

        System.out.println("integer2 : " + integer2);
    }
}
