package self.collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        // 숫자만 입력 하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3");
        System.out.println("numberList = " + numberList);       // numberList = [1, 2, 문자3] size=3, capacity=5

        // Object를 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);
        // 오류 발생
        Integer numb3 = (Integer) numberList.get(2);            // class java.lang.String cannot be cast to class java.lang.Integer

        //numberList 에는 숫자만 입력하기를 기대했지만, Object 를 받아서 저장하기 때문에 자바의 모든 타입을 다
        //저장할 수 있다. 따라서 숫자를 입력하다가 실수로 문자를 입력해도 아무런 문제가 되지 않는다.
        //값을 꺼낼 때 Object 를 반환하기 때문에, 원래 입력한 타입으로 받으려면 다운 캐스팅을 해야한다. 이때 입력한
        //데이터 타입을 정확하게 알고 있지 않으면 예외가 발생한다. 지금처럼 중간에 문자가 들어가면 문제가 될 수 있다.
        //참고로 하나의 자료 구조에 숫자와 문자처럼 서로 관계없는 여러 데이터 타입을 섞어서 보관하는 일은 거의 없다. 일반
        //적으로 같은 데이터 타입을 보관하고 관리한다.
    }
}
