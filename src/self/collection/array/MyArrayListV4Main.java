package self.collection.array;

public class MyArrayListV4Main {

    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        // stringList.add(1);           // 컴파일 에러 발생: <String>으로 타입을 명시했기 때문
        String string = stringList.get(0);
        System.out.println("string = " + string);       // string = a

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        // intList.add("문자 4");     // 컴파일 에러 발생: <Integer>으로 타입을 명시했기 때문
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);     // integer = 1
    }
}
