package self.collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {

    private static final int DEFAULT_CAPACITY = 5;      // 리스트를 생성할 때 사용하는 기본 배열의 크기

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];     // new E[DEFAULT_CAPACITY];  컴파일 에러 발생함
    }

    //Object 배열을 사용한 이유
    //Object[] elementData 을 그대로 사용하는 이유
    //제네릭은 런타임에 이레이저에 의해 타입 정보가 사라진다. 따라서 런타임에 타입 정보가 필요한 생성자에 사용할수 없다.
    // 따라서 제네릭을 기반으로 배열을 생성하는 다음 코드는 작동하지 않고, 컴파일 오류가 발생한다.
    //참고로 이것은 자바가 제공하는 제네릭의 한계이다.
    //new E[DEFAULT_CAPACITY] 대신에 다음과 같이 모든 데이터를 담을 수 있는 Object를 그대로 사용해야 한다.
    //new Object[DEFAULT_CAPACITY]

    // 제네릭 타입 인자 적용 전
    /**
     * Object[] elementData;
     * void add(E e) {
     *  elementData[size] = e;
     *  ...
     * }
     * E get(int index) {
     *  return (E) elementData[index];
     * }
     * **/

    // 제네릭 타입 인자 적용 후
    /**
     * Object[] elementData;
     * void add(String e) {
     *  elementData[size] = e;
     *  ...
     * }
     * String get(int index) {
     *  return (String) elementData[index];
     * }
     * **/

    //정리하면 생성자에는 제네릭의 타입 매개변수를 사용할 수 없는 한계가 있다.
    //따라서 배열을 생성할 때 대안으로 Object 배열을 사용해야 한다.
    //하지만 제네릭이 리스트의 데이터를 입력 받고 반환하는 곳의 타입을 고정해준다.
    //따라서 고정된 타입으로 Object 배열에 데이터를 보관하고, 또 데이터를 꺼낼 때도 같은 고정된 타입으로 안전하게 다운 캐스팅 할 수 있다.

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

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

    @SuppressWarnings("unchecked")      // Object를 E로 캐스팅 시 문제가 생길 수 있음을 무시하겠다는 뜻
    public E get(int index) {
        return (E) elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);       // 예전 값 미리 꺼내기
        elementData[index] = element;       // 새로운 값 셋팅
        return oldValue;                    // 미리 꺼낸 예전 값 반환\
    }

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

    public int indexOf(E e) {
        for(int i=0; i<size; i++) {
            if(e.equals(elementData[i])) {
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
