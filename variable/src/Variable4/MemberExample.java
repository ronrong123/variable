package Variable4;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 =  new Member();
		
		m1.setMemName("김유진");
		m1.setMemNo(1);
		m1.setMemp("010-7142-6359");
		m1.setMemc("폴댄스");
		
		System.out.println(m1.getMemc());
		System.out.println(m1.getMemName());
		
		
		System.out.println(m1);
		

	}

}
