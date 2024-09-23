package self.generic.test.ex5;

/**
 * 컴파일 시점에 T는 Object로 변한다. -> eraser
 *
 * void main() {
 *      GenericBox box = new GenericBox();
 *      box.set(10);
 *      Integer result = (Integer) box.get();       //컴파일러가 캐스팅 추가
 * }
 * **/

public class EraserBox<T> {
    
    public boolean instanceCheck(Object param) {
        // return param instanceof T;       // 컴파일 오류

        // T는 런타임 시점에 모두 Object로 변해버린다.
        // instanceof는 항상 Object와 비교하게 된다. 이렇게 되면 항상 참이 반환되는 문제가 발생한다.
        // 자바는 이런 문제 때문에 매개변수에 instanceof를 허용하지 않는다.

        return false;
    }

    public T create() {
        // return new T();                  // 컴파일 오류

        // new T는 항상 new Object가 되어버린다. 개발자가 의도한 것과 다른다.
        // 따라서 자바는 타입 매개변수에 new를 허용하지 않는다.

        return null;
    }
}
