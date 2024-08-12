package self.lang.String.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(isSame(str1, str2));     // false
        System.out.println(isSame2(str1, str2));    // true

        String str3 = "hello";
        String str4 = "hello";
        System.out.println(isSame(str3, str4));     // true
        System.out.println(isSame2(str3, str4));    // true

    }

    // 위험한 문자열 비교 메서드 (동일성)
    // 경우에 따라 같은 내용의 문자열이지만 false반환
    private static boolean isSame(String x, String y) {
        return x == y;
    }

    // 안전한 문자열 비교 메서드 (동등성)
    // 내용만 같다면 true 반환
    private static boolean isSame2(String x, String y) {
        return x.equals(y);
    }
}
