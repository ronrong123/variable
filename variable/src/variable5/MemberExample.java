package variable5;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member();
		System.out.println("이름: " + m1.getMemName());
		Member m2 = new Member(1, "KIM", "010-7142-6359", "수영");		
		System.out.println("이름: " + m2.getMemName());
		
		Member m3 = new Member("Hwang", 2);	
		System.out.println("이름: " + m3.getMemName());		
	}
	
}
