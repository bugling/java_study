package self.collection.array;

public class MyArrayListV2Main {

    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2();

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

        list.add("f");                  // list = x100  ----->  x200로 참조 주소 변경      // 배열( x100 )은 더는 참조하는 곳이 없으므로 GC의 대상이 된다.
        System.out.println(list);       // [a, b, z, d, e, f] size=6, capacity=10\

        //grow() 를 호출할 때 배열의 크기는 기존과 비교해서 2배씩 증가한다.
        //예) 2 4 8 16 32 64 128
        //데이터가 하나 추가될 때 마다 배열의 크기를 1씩만 증가하게 되면 배열을 복사하는 연산이 너무 자주 발생할 가
        //능성이 높다.
        //배열을 새로 복사해서 만드는 연산은 배열을 새로 만들고 또 기존 데이터를 복사하는 시간이 걸리므로 가능한 줄
        //이는 것이 좋다. 이렇게 2배씩 증가하면 배열을 새로 만들고 복사하는 연산을 줄일 수 있다. 반면에 배열의 크기를
        //너무 크게 증가하면 사용되지 않고 낭비되는 메모리가 많아지는 단점이 발생할 수 있다.
        //참고로 예제를 단순화 하기 위해 여기서는 2배씩 증가했지만, 보통 50% 정도 증가하는 방법을 사용한다.

        //우리가 만든 MyArrayListV2 는 정적인 배열과 다르게 크기가 동적으로 변하는 자료 구조이다. 따라서 데이터의 크
        //기를 미리 정하지 않아도 된다. 물론 MyArrayListV2 의 내부에서는 배열을 사용하지만, MyArrayListV2 를 사용
        //하는 개발자들은 이런 부분을 신경쓰지 않아도 된다.

    }
}
