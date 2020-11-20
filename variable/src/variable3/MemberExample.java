package variable3;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member();
		
		Member[] members = {m1, m2};
		
		m1.memName = "김유진";
		m1.memNo = 1;
		m1.memp = "010-7142-6359";
		m1.memc = "폴댄스";		
		m1.showMemberInfo();

		m2.memName = "송예솔";
		m2.memNo = 2;
		m2.memp = "010-7424-9559";
		m2.memc = "폴댄스";
		m2.showMemberInfo();
		
		for(Member mem:members) {
			mem.showMemberInfo();
		}

	}
}
