package self.collection.array;

import java.util.Arrays;

// 마지막에 추가
//add() 를 사용해서 데이터를 추가하는 경우 리스트의 마지막( size )에 데이터를 추가한다.
    // ex) size=1인 배열에 add()메서드 사용 시 list[0]까지만 데이터가 있기 때문에 list[1]에 데이터가 추가됨
//데이터를 리스트의 마지막에 추가하기 때문에 기존 데이터를 이동하지 않는다.
//size 를 배열의 index 로 사용하고 기존 데이터를 이동하지 않기 때문에 O(1)로 표현할 수 있다.
//add(index, e) 를 사용해서 원하는 위치에 데이터를 추가할 수 있다.
//데이터를 리스트의 마지막에 추가하기 때문에 기존 데이터를 이동하지 않는다.
//O(1)로 표현할 수 있다.

// 앞에 추가
//add(index, e) 를 사용해서 원하는 위치에 데이터를 추가할 수 있다.
//추가할 위치를 확보하기 위해 입력한 위치를 기준으로 데이터를 오른쪽으로 한 칸씩 이동해야 한다.
//앞서 보았듯 마지막 위치에 추가하는 경우는 데이터를 이동하지 않는다.
//데이터를 추가할 위치는 배열의 인덱스를 사용하므로 O(1)로 빠르게 찾을 수 있지만, 데이터를 이동하는데 O(n)이 소요된다.
//O(n)으로 표현할 수 있다.

//마지막에 삭제
//remove(index) 를 사용해서 원하는 위치에 있는 데이터를 삭제할 수 있다.
//이때 마지막 위치라면 기존 데이터를 이동할 필요가 없다.
//참고로 데이터를 삭제하면 리스트의 크기인 size 가 하나 줄어든다.
//O(1)로 표현할 수 있다.

//앞에 삭제
//remove(index) 를 사용해서 원하는 위치에 있는 데이터를 삭제할 수 있다.
//이때 마지막 위치가 아니라면 삭제할 데이터의 위치를 기준으로 데이터를 한 칸씩 왼쪽으로 이동해야 한다.
//데이터를 삭제할 위치는 배열의 인덱스를 사용하므로 O(1)로 빠르게 찾을 수 있지만, 데이터를 이동하는데 O(n)이 소요된다.
//O(n)으로 표현할 수 있다.
public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5;      // 리스트를 생성할 때 사용하는 기본 배열의 크기

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        if(size == elementData.length){
            grow();
        }

        elementData[size] = e;
        size++;
    }

    public void add(int index, Object e) {
        if(size == elementData.length) {
            grow();
        }
        // 데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    // 코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for(int i=size; i>index; i--) {
            elementData[i] = elementData[i-1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        // 새로운 참조값을 바라보도록 한다.
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);       // 예전 값 미리 꺼내기
        elementData[index] = element;       // 새로운 값 셋팅
        return oldValue;                    // 미리 꺼낸 예전 값 반환\
    }

    public Object remove(int index) {
        Object oldValue = get(index);

        // 데이터 이동
        shiftLeftFrom(index);

        size--;

        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for(int i=index; i<size-1; i++) {
            elementData[i] = elementData[i+1];
        }
    }

    public int indexOf(Object o) {
        for(int i=0; i<size; i++) {
            if(o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + " size=" + size + ", capacity=" + elementData.length;
    }

}
