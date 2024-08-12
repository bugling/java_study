package self.lang.String;

public class StringConcatMain {

    public static void main(String[] args){
        String a = "hello";     // 참조값: x001
        String b = " java";     // 참조값: x002

        String result1 = a.concat(b);       // x001.concat(x002);
        String result2 = a + b;             // x001 + x002

        System.out.println(result1);        // hello java
        System.out.println(result2);        // hello java
    }
}
