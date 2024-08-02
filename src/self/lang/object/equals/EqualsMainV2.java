package self.lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] agrs){
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity ( 동일성 ) = " + (user1 == user2));       // identity ( 동일성 ) = false
        System.out.println("equality ( 동등성 ) = " + (user1.equals(user2)));  // equality ( 동등성 ) = true
    }
}
