package self.collection.link;

public class MyLinkedListV2 {

    private Node first;             // default: first = null;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if(first == null) {
            first = newNode;
        }else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while(x.next != null){
            x = x.next;
        }
        return x;
    }

    // 추가 코드
    public void add(int index, Object e) {
        Node newNode = new Node(e);

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

            Node prev = getNode(index - 1);     // 삽입하고자 하는 위치의 직전 노드 구하기
            newNode.next = prev.next;                 // 직전 노드의 이후 -> 새 노드의 직후      // 직후 노드에 2개 노드로 연결
            prev.next = newNode;                      // 직전 노드와 새 노드 연결               // 직후 노드에 1개 연결 -> 세 노드 나란히 연결 완료
        }
        size++;     // 사이즈 올리기

    }

    // 추가 코드
    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        
        // 첫번 째 위치의 요소를 삭제하는 경우
        if(index == 0) {
            first = removeNode.next;        // 바로 뒤에 있는 요소를 첫번째로 교체하기
        }
        // 중간 위치의 요소를 삭제
        else {
            Node prev = getNode(index - 1);
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

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        // index번 만큼 반복하기 때문에 MyArrayList에 비해 성능이 떨어진다.
        for(int i=0; i<index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        for(Node x = first; x != null; x = x.next){
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
}
