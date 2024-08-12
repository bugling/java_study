package self.lang.String.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int len = 0;
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " : " + arr[i].length());
            len += arr[i].length();
        }

        // hello : 5
        // java : 4
        // jvm : 3
        // spring : 6
        // jpa : 3

        System.out.println("arr배열의 문자 길이 합 : " + len  );        // arr배열의 문자 길이 합 : 21
    }
}
