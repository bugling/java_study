package self.collection.link;

public class NodeMain1 {

    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");             // first -> x001[ item: A (next: null) ]
        first.next = new Node("B");             // first -> x001[ item: A (next: x002) ] - x002[ item: B (next: null) ]
        first.next.next = new Node("C");        // first -> x001[ item: A (next: x002) ] - x002[ item: B (next: x003) ] - x003[ item: C (next: null) ]

        System.out.println("모든 노드 탐색하기");
        System.out.println("first.item = " + first.item);                       // first.item = A
        System.out.println("first.next.item = " + first.next.item);             // first.next.item = B
        System.out.println("first.next.next.item = " + first.next.next.item);   // first.next.next.item = C

        Node x = first;
        while(x != null) {
            System.out.println(x.item);
            x = x.next;
        }

        //A
        //B
        //C
    }
}
