package self.collection.array;

public class MyArrayListV1Main {

    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();

        System.out.println("===데이터 추가===");
        System.out.println(list);       // [] size=0, capacity=5
        list.add("a");
        System.out.println(list);       // [a] size=1, capacity=5
        list.add("b");
        System.out.println(list);       // [a, b] size=2, capacity=5
        list.add("c");
        System.out.println(list);       // [a, b, c] size=3, capacity=5

        System.out.println("===기능 사용===");
        System.out.println("list.size() = " + list.size());     // list.size() = 3
        System.out.println("list.get(1) = " + list.get(1));     // list.get(1) = b
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));       // list.indexOf("c") = 2
        System.out.println("list.set(2, \"z\") = " + list.set(2, "z"));         // list.set(2, "z") = c         ** 기존 list[2] 값 반환
        System.out.println("list = " + list);                   // list = [a, b, z] size=3, capacity=5

        System.out.println("===범위 초과===");
        list.add("d");
        System.out.println(list);       // [a, b, z, d] size=4, capacity=5
        list.add("e");
        System.out.println(list);       // [a, b, z, d, e] size=5, capacity=5
        
        // 범위 초과, capacity가 늘어나지 않으면 예외 발생
        list.add("f");
        System.out.println(list);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //	at self.collection.array.MyArrayListV1.add(MyArrayListV1.java:26)
        //	at self.collection.MyArrayListMain.main(MyArrayListMain.java:31)
    }
}
