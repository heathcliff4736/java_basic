package javabasic_02.day07;

public class MemberTesst {
    public static void main(String[] args) {

        Member ss_health1 = new Member();
        ss_health1.name = "홍길동";
        ss_health1.age = 30;
        ss_health1.tel = "010-1234-1234";
        ss_health1.email = "hong1234@naver.com";
        ss_health1.address = "서울시 강남구 홍길동 54-12";
        ss_health1.weight = 78.7;

        Member ss_health2 = new Member();
        ss_health2.name = "임꺽정";
        ss_health2.age = 32;
        ss_health2.tel = "010-4567-4567";
        ss_health2.email = "kklim4567@naver.com";
        ss_health2.address = "서울시 강남구 임꺽동 78-90";
        ss_health2.weight = 97.2;

        // 삼성지점 sshealth 헬스 센터
        Member[] 삼성 = new Member[2];
        삼성[0] = ss_health1;
        삼성[1] = ss_health2;
        
        //삼성 지점 회원의 리스트 출력
        for (int i = 0; i < 삼성.length; i++) {
            Member member = 삼성[i];
            System.out.println(member.name);
        }


    }
}
