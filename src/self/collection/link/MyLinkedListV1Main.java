package self.collection.link;

public class MyLinkedListV1Main {

    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();

        System.out.println("===데이터 추가===");
        System.out.println(list);       // MyLinkedListV1{first=null, size=0}
        list.add("a");
        System.out.println(list);       // MyLinkedListV1{first=[a], size=1}
        list.add("b");
        System.out.println(list);       // MyLinkedListV1{first=[a->b], size=2}
        list.add("c");
        System.out.println(list);       // MyLinkedListV1{first=[a->b->c], size=3}

        System.out.println("===기능 사용===");
        System.out.println("list.size() = " + list.size());     // list.size() = 3
        System.out.println("list.get(1) = " + list.get(1));     // list.get(1) = b
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));       // list.indexOf("c") = 2
        System.out.println("list.set(2, \"z\") = " + list.set(2, "z"));         // list.set(2, "z") = c         ** 기존 list[2] 값 반환
        System.out.println("list = " + list);                   // list = MyLinkedListV1{first=[a->b->z], size=3}

        System.out.println("===범위가 없기 때문에 초과하지 않고 끝없이 늘릴 수 있음===");
        list.add("d");
        System.out.println(list);       // MyLinkedListV1{first=[a->b->z->d], size=4}
        list.add("e");
        System.out.println(list);       // MyLinkedListV1{first=[a->b->z->d->e], size=5}
        list.add("f");
        System.out.println(list);       // MyLinkedListV1{first=[a->b->z->d->e->f], size=6}

        //Object get(int index)
        //특정 위치에 있는 데이터를 반환한다.
        //O(n)
        //배열은 인덱스로 원하는 데이터를 즉시 찾을 수 있다. 따라서 배열을 사용하는 배열 리스트( ArrayList )
        //도 인덱스로 조회시 O(1)의 빠른 성능을 보장한다. 하지만 연결 리스트에서 사용하는 노드들은 배열이 아니
        //다. 단지 다음 노드에 대한 참조가 있을 뿐이다. 따라서 인덱스로 원하는 위치의 데이터를 찾으려면 인덱스
        //숫자 만큼 다음 노드를 반복해서 찾아야 한다. 따라서 인덱스 조회 성능이 나쁘다.
        //특정 위치의 노드를 찾는데 O(n)이 걸린다.
        //void add(Object e)
        //마지막에 데이터를 추가한다.
        //O(n)
        //마지막 노드를 찾는데 O(n)이 소요된다. 마지막 노드에 새로운 노드를 추가하는데 O(1)이 걸린다. 따라서
        //O(n)이다.
        //Object set(int index, Object element)
        //특정 위치에 있는 데이터를 찾아서 변경한다. 그리고 기존 값을 반환한다.
        //O(n)
        //특정 위치의 노드를 찾는데 O(n)이 걸린다.
        //int indexOf(Object o)
        //데이터를 검색하고, 검색된 위치를 반환한다.
        //O(n)
        //모든 노드를 순회하면서 equals() 를 사용해서 같은 데이터가 있는지 찾는다.
        //정리
        //앞서 노드와 연결의 개념을 이해했다면 충분히 이해할 수 있을 것이다. 만약 이해가 어렵다면 노드와 연결을 다시
        //복습하자. 그리고 코드를 따라서 종이에 천천히 노드를 그려보면 이해가 될 것이다.
        //연결 리스트를 통해 데이터를 추가하는 방식은 꼭 필요한 메모리만 사용한다. 따라서 배열 리스트의 단점인 메모
        //리 낭비를 해결할 수 있었다.
        //물론 연결을 유지하기 위한 추가 메모리가 사용되는 단점도 함께 존재한다.
        //배열 리스트는 중간에 데이터를 추가하거나 삭제할 때 기존 데이터를 한 칸씩 이동해야 하는 문제가 있었다. 연결 리스
        //트는 이 문제를 어떻게 해결하는지 알아보자.
    }
}
