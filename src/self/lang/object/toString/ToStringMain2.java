package self.lang.object.toString;

public class ToStringMain2 {
    public static void main(String[] args){
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("밀크", 2);
        Dog dog2 = new Dog("초고", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());         // self.lang.object.toString.Car@4e50df2e
        System.out.println(dog1.toString());        // Dog{dogName='밀크', age=2}
        System.out.println(dog2.toString());        // Dog{dogName='초고', age=5

        System.out.println("2. println 내부에서 toString 호출 (println 내부에서 toString이 포함되어 있어서 위와 동일한 결과 출력)");
        System.out.println(car);                    // self.lang.object.toString.Car@4e50df2e
        System.out.println(dog1);                   // Dog{dogName='밀크', age=2}
        System.out.println(dog2);                   // Dog{dogName='초고', age=5

        System.out.println("3. Object 다형성 활용");
        ObjectPrint.print(car);                    // 객체 정보 출력 : self.lang.object.toString.Car@4e50df2e
        ObjectPrint.print(dog1);                   // 객체 정보 출력 : Dog{dogName='밀크', age=2}
        ObjectPrint.print(dog2);                   // 객체 정보 출력 : Dog{dogName='초고', age=5}

        System.out.println("toString을 재정의 했지만, 물리적 주소를 알고 싶을 때(기존의 toString 기능을 사용하고 싶을 때)");

        // 10진수의 물리적 주소 받아 오기
        int idHashCode1 = System.identityHashCode(dog1);
        int idHashCode2 = System.identityHashCode(dog2);

        System.out.println("id1 : " + idHashCode1 + "  /  id2 : " + idHashCode2);       // id1 : 51228289  /  id2 : 455896770

        // 16진수로 변환
        String idHexCode1 = Integer.toHexString(idHashCode1);
        String idHexCode2 = Integer.toHexString(idHashCode2);

        System.out.println("hex1 : " + idHexCode1 + "  /  hex2 : " + idHexCode2);       // hex1 : 30dae81  /  hex2 : 1b2c6ec2
    }
}
