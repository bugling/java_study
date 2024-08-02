package self.lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args){
        
        // 같은 id를 가진 두 개의 UserV1 객체를 생성     // 객체타입: 동일 && 아이디: 동일
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity ( 동일성 ) = " + (user1 == user2));       // identity ( 동일성 ) = false
        System.out.println("equality ( 동등성 ) = " + (user1.equals(user2)));  // equality ( 동등성 ) = false
    }
}
