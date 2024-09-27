package self.collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 5;      // 리스트를 생성할 때 사용하는 기본 배열의 크기

    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];     // new E[DEFAULT_CAPACITY];  컴파일 에러 발생함
    }

    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    public void add(E e) {
        if(size == elementData.length){
            grow();
        }

        elementData[size] = e;
        size++;
    }

    @Override
    public void add(int index, E e) {
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

    @Override
    @SuppressWarnings("unchecked")      // Object를 E로 캐스팅 시 문제가 생길 수 있음을 무시하겠다는 뜻
    public E get(int index) {
        return (E) elementData[index];
    }

    @Override
    public Object set(int index, Object element) {
        Object oldValue = get(index);       // 예전 값 미리 꺼내기
        elementData[index] = element;       // 새로운 값 셋팅
        return oldValue;                    // 미리 꺼낸 예전 값 반환\
    }

    @Override
    public E remove(int index) {
        E oldValue = get(index);

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

    @Override
    public int indexOf(E e) {
        for(int i=0; i<size; i++) {
            if(e.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + " size=" + size + ", capacity=" + elementData.length;
    }

}
