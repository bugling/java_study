package self.enumeration.test;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    // 필드
    private final int level;
    private final String descriptoin;

    // 생성자
    AuthGrade(int level, String descriptoin) {
        this.level = level;
        this.descriptoin = descriptoin;
    }

    // getter
    public String getDescriptoin() {
        return descriptoin;
    }

    public int getLevel() {
        return level;
    }
    
    // 사용자 정의 메서드
    public String showMenu() {
        String menu = "";

        if(level >= 1) menu += " -메인화면";              // 1, 2, 3 true
        if(level >= 2) menu += "\n -이메일 관리 화면";     // 2, 3 true
        if(level >= 3) menu += "\n -관리자 화면";         // 3만 true

        return menu;
    }
}
