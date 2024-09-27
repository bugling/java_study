package self.collection.list;

public class MyLinkedList<E> implements MyList<E>{

    private Node<E> first;             // default: first = null;
    private int size = 0;

    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if(first == null) {
            first = newNode;
        }else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while(x.next != null){
            x = x.next;
        }
        return x;
    }

    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);

        // 첫 번째 칸에 추가 하는 경우
        if(index == 0) {
            newNode.next = first;
            first = newNode;
        }
        // 중간에 추가하는 경우
        else {

            // first -> x001[ item: A (next: x002) ] - x002[ item: B (next: null) ]
            // index = 1;
            // newNode = x003[ item: C (next: null) ]
            // prev = x001[ item: A (next: x002) ]
            // newNode.next = prev.next[x002]   // x003[ item: C (next: x002) ]
            // prev.next = newNode[x003]

            Node<E> prev = getNode(index - 1);     // 삽입하고자 하는 위치의 직전 노드 구하기
            newNode.next = prev.next;                 // 직전 노드의 이후 -> 새 노드의 직후      // 직후 노드에 2개 노드로 연결
            prev.next = newNode;                      // 직전 노드와 새 노드 연결               // 직후 노드에 1개 연결 -> 세 노드 나란히 연결 완료
        }
        size++;     // 사이즈 올리기

    }

    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        
        // 첫번 째 위치의 요소를 삭제하는 경우
        if(index == 0) {
            first = removeNode.next;        // 바로 뒤에 있는 요소를 첫번째로 교체하기
        }
        // 중간 위치의 요소를 삭제
        else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }

        // 삭제시키는 노드의 모든 정보를 set null
        removeNode.item = null;
        removeNode.next = null;

        // 사이즈 줄이기
        size--;

        // 삭제한 Node를 활용할 수 있도록 반환 처리함
        return removedItem;
    }

    @Override
    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        // index번 만큼 반복하기 때문에 MyArrayList에 비해 성능이 떨어진다.
        for(int i=0; i<index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public int indexOf(E o) {
        int index = 0;
        for(Node<E> x = first; x != null; x = x.next){
            if(o.equals(x.item)){
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    // Node 클래스는 MyLinkedListV3에서만 사용함 -> 중첩 클래스로 설계
    // 중첩 클래스를 사용하면 MyLinkedListV3 입장에서 외부에 있는 Node 클래스보다 내부에 선언한 Node 클래스를 먼저 사용한다.
    private static class Node<E> {

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        // [A->B->C]
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;  // 자기 자신을 x에 대입
            sb.append("[");
            while(x != null){
                sb.append(x.item);
                if(x.next != null)
                    sb.append("->");
                x = x.next;
            }
            sb.append("]");

            return sb.toString();
        }
    }
}
