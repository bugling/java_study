package self.collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();

        // 마지막에 추가  // O(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list = " + list);       // list = MyLinkedListV1{first=[a->b->c], size=3}

        System.out.println("[첫 번째 항목에 추가]");
        list.add(0,"d");    // O(1)
        System.out.println(list);                   // MyLinkedListV1{first=[d->a->b->c], size=4}

        System.out.println("[첫 번째 항목에 삭제]");
        list.remove(0);       // O(1)
        System.out.println(list);                   // MyLinkedListV1{first=[a->b->c], size=3}

        System.out.println("[중간 항목에 추가]");
        list.add(1, "e");   // O(n)
        System.out.println(list);                   // MyLinkedListV1{first=[a->e->b->c], size=4}

        System.out.println("[중간 항목 삭제]");
        list.remove(1);         // O(n)
        System.out.println(list);                   // MyLinkedListV1{first=[a->b->c], size=3}

        //기능            배열 리스트 연결 리스트
        //인덱스 조회      O(1)       O(n)
        //검색            O(n)       O(n)
        //앞에 추가(삭제)   O(n)       O(1)
        //뒤에 추가(삭제)   O(1)       O(n)
        //평균 추가(삭제)   O(n)       O(n)

        //배열 리스트는 인덱스를 통해 추가나 삭제할 위치를 O(1)로 빠르게 찾지만, 추가나 삭제 이후에 데이터를 한 칸씩
        //밀어야 한다. 이 부분이 O(n)으로 오래 걸린다.
        //반면에 연결 리스트는 인덱스를 통해 추가나 삭제할 위치를 O(n)으로 느리게 찾지만, 찾은 이후에는 일부 노드의
        //참조값만 변경하면 되므로 이 부분이 O(1)로 빠르다.
        //앞에 추가하는 경우: 연결 리스트는 배열 리스트처럼 추가한 항목의 오른쪽에 있는 데이터를 모두 한 칸씩 밀지 않
        //아도 된다. 단순히 일부 노드의 참조만 변경하면 된다. 따라서 데이터를 앞쪽에 추가하는 경우 보통 연결 리스트가
        //더 좋은 성능을 제공한다.
        //배열 리스트: 데이터를 앞쪽에 추가하는 경우 모든 데이터를 오른쪽으로 한 칸씩 밀어야 한다. O(n)
        //연결 리스트: 데이터를 앞쪽에 추가하는 경우 일부 노드의 참조만 변경하면 된다. O(1)
        //마지막에 데이터를 추가하는 경우
        //배열 리스트
        //인덱스로 마지막 위치를 바로 찾을 수 있다. O(1)
        //데이터를 마지막에 추가하는 경우 데이터를 이동하지 않아도 된다. O(1)
        //따라서 O(1)의 성능을 제공한다.
        //연결 리스트
        //노드를 마지막까지 순회해야 마지막 노드를 찾을 수 있다. 따라서 마지막 노드를 찾는데 O(n)의 시간
        //이 걸린다.
        //데이터를 추가하는 경우 일부 노드의 참조만 변경하면 된다. O(1)
        //따라서 O(n)의 성능을 제공한다

        //참고 - 단일 연결 리스트, 이중 연결 리스트
        //우리가 구현한 연결 리스트는 한 방향으로만 이동하는 단일 연결 리스트다. 노드를 앞뒤로 모두 연결하는 이중 연결 리
        //스트를 사용하면 성능을 더 개선할 수 있다.
        //뒤에서 설명하지만 자바가 제공하는 연결 리스트는 이중 연결 리스트다. 추가로 자바가 제공하는 연결 리스트는 마지막
        //노드를 참조하는 변수를 가지고 있어서, 뒤에 추가하거나 삭제하는 삭제하는 경우에도 O(1)의 성능을 제공한다. 자세한
        //내용은 뒤에서 설명한다
    }
}
