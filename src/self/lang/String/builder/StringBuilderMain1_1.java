package self.lang.String.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");

        System.out.println(sb);     // ABCD

        sb.insert(4, "Java");
        System.out.println(sb);     // ABCDJava

        sb.delete(4, 8);
        System.out.println(sb);     // ABCD

        sb.reverse();
        System.out.println(sb);     // DCBA

        // StringBuilder(가변) -> String(불변)
        String str = sb.toString();
        System.out.println(str);    // DCBA

        // 가변(Mutable) vs 불변(Immutable)
        // String은 불변하다. 즉, 한 번 생성되면 그 내용을 변경할 수 없다.
        // 따라서 문자열에 변화를 주려고 할 때마다 새로운 String 객체가 생성되고, 기존 객체는 버려진다.
        // 이 과정에서 메모리와 처리 시간이 더 많이 소모된다.
        // 반면에, StringBuilder는 가변적이다. 하나의 StringBuilder 객체 안에서 문자열을 추가, 삭제, 수정할 수 있으며,
        // 이 때마다 새로운 객체를 생성하지 않는다. 이로 인해 메모리 사용을 줄이고 성능을 향상시킬 수 있다.
        // 단, 사이드 이펙트를 주의해야 한다.

        // StringBuilder는 보통 문자열을 변경하는 동안만 사용하다가 무자열 변경이 끝나면 안전한(불변) String으로 변환하는 것이 좋다.
    }

}
