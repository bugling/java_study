package self.enumeration.test;

import java.sql.SQLOutput;

public class AuthGradeMain {
    public static void main(String[] args) {

        AuthGrade[] authGrades = AuthGrade.values();
        for(AuthGrade authGrade : authGrades){
            printAuthGrade(authGrade);
        }

        // 실행 결과
        /**
         * grade=GUEST, level=1, 설명=손님
         * grade=LOGIN, level=2, 설명=로그인 회원
         * grade=ADMIN3, level=3, 설명=관리자
         * **/
    }

    private  static void printAuthGrade (AuthGrade authGrade) {
        System.out.println("grade=" + authGrade.name() + ", level=" + authGrade.getLevel() + ", 설명=" + authGrade.getDescriptoin());
    }
}
