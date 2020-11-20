package variable3;

public class Member {
/*
 * 회원번호: 1 ~      담을 필드
회원이름: 홍길동
회원전화번호 : 010-1234-5678
강좌명: 스포츠댄스/수영
필드 : 소문자, 두단어의 첫번째 글자는 대문자
 */
	
		String memName;
		int memNo;
		String memp;
		String memc;
		
		public void showMemberInfo() {
			System.out.println("회원번호: " + memNo + " 회원이름: " + memName + "입니다." );
		}
		

}
