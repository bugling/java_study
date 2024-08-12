package self.lang.String.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();        // x001
        int result = adder.add(1).add(2).add(3).getValue();     // adder를 반환하기 때문에 adder에서 사용할 수 있는 메서드를 연쇄적으로 호출 가능

        // x001.add(1).add(2).add(3).getValue();    // result = 0;
        // x001.add(2).add(3).getValue();           // result = 1
        // x001.add(3).getValue();                  // result = 3
        // x001.getValue();                         // result = 6

        System.out.println("result = " + result);   // result = 6
    }
}
