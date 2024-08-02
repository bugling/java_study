package self.lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2 (String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;                                  // 같은 객체가 인자로 true 반환   //ex) user1.equals(user1);
        if(o == null || getClass() != o.getClass()) return false;   // 객체가 null이거나 다른 타입의 객체가 인자로 들어오면 false 반환
        UserV2 userV2 = (UserV2) o;                                 // 위 조건들을 통과하면 임시로 새로운 UserV2 객체에 담기
        return Objects.equals(id, userV2.id);                       // 메서드를 호출한 UserV2와 인자로 들어온 UserV2의 아이디가 동일한지 체크
    }

    /**
     *      Objects.equals(id, userV2.id)
     *      1. null 검사: Objects.equals()는 먼저 id와 userV2.id가 모두 null인지, 또는 한쪽만 null인지 확인합니다.
     *         두 값이 모두 null인 경우 true를 반환합니다.
     *         한쪽만 null인 경우 false를 반환합니다.
     *
     *      2. 동등성 비교: 두 값이 모두 null이 아닌 경우 id.equals(userV2.id)를 호출하여 두 객체의 내용을 비교합니다. 이때 equals() 메서드는 객체의 내용이 같은지 여부를 확인합니다.
     * **/

}
