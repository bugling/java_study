package self.generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();   // Object -> Integer 캐스팅
        System.out.println("Integer = " + integer);     // Integer = 10

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();          // Object -> String 캐스팅
        System.out.println("String = " + str);          // String = hello

        // 잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get();    // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);       // class java.lang.String cannot be cast to class java.lang.Integer
    }
}
