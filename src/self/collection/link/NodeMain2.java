package self.collection.link;

public class NodeMain2 {

    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");             // first -> x001[ item: A (next: null) ]
        first.next = new Node("B");             // first -> x001[ item: A (next: x002) ] - x002[ item: B (next: null) ]
        first.next.next = new Node("C");        // first -> x001[ item: A (next: x002) ] - x002[ item: B (next: x003) ] - x003[ item: C (next: null) ]

        System.out.println("모든 노드 탐색하기");
        
        // 기본적으로 ide에서 만들어주는 toString을 사용했을 때
        //System.out.println(first);      // Node{item=A, next=Node{item=B, next=Node{item=C, next=null}}}
        // 위와 같이 출력되는 이유
        // first -> x001 Node{item=A, next=x002}
        // first -> x001 Node{item=A, next=Node{item=B, next=x003}}
        // first -> x001 Node{item=A, next=Node{item=B, next=xNode{item=C, next=null}}}

        // 커스텀한 toString을 사용했을 때
        System.out.println(first);              // [A->B->C]
        System.out.println(first.next);         // [B->C]
        System.out.println(first.next.next);    // [C]

        System.out.println("[모든 노드 탐색하기]");
        printAll(first);
        //A
        //B
        //C

        System.out.println("[마지막 노드 조회하기]");
        Node loastNode = getLastNode(first);
        System.out.println("loastNode = " + loastNode);     // loastNode = [C]

        System.out.println("[특정 index의 노드 조회하기]");
        int index = 2;
        Node index2Node = getNdoe(first, index);
        System.out.println("index2Node = " + index2Node);   // index2Node = [C]

        System.out.println("[데이터 추가하기]");
        add(first, "D");
        System.out.println("Node 추가 후 = " + first);     // Node 추가 후 = [A->B->C->D]
    }

    private static void printAll(Node node) {
        Node x = node;
        while(x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null){
            x = x.next;
        }
        return x;       // x.next == null(마지막 노드)
    }

    private static Node getNdoe(Node node, int index) {
        Node x = node;
        // index만큼 next로 이동     // index=0: 0번 이동 -> 0번째 노드 반환  // index=1: 1번 이동 -> 1번째 노드 반환  // index=2: 2번 이동 -> 2번째 노드 반환...
        for(int i=0; i<index; i++) {
            x = x.next;     // 반복문 마지막에 index번째 Node가 x에 대입됨
        }
        return x;
    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }

    //정리
    //노드는 내부에 데이터와 다음 노드에 대한 참조를 가지고 있다.
    //지금까지 설명한 구조는 각각의 노드가 참조를 통해 연결(Link, 링크) 되어 있다.
    //데이터를 추가할 때 동적으로 필요한 만큼의 노드만 만들어서 연결하면 된다. 따라서 배열과 다르게 메모리를 낭
    //비하지 않는다.
    //물론 next 필드를 통해 참조값을 보관해야 하기 때문에 배열과 비교해서 추가적인 메모리 낭비도 발생한
    //다.
    //노드와 연결 구조를 처음 공부하면 이해하기 쉽지않다. 하지만 반복해서 학습하고 또 코드도 직접 만들어보면서
    //반드시 이해해야 한다. 이해가 어렵다면 코드를 따라서 종이에 천천히 노드를 그려보면 이해가 될 것이다.
    //이렇게 각각의 노드를 연결(링크)해서 사용하는 자료 구조로 리스트를 만들 수 있는데, 이것을 연결 리스트라 한
    //다
}
