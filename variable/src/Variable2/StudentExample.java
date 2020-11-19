package Variable2;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("김유진");
		s1.setSno(112233);
		s1.setEns(60);
		s1.setMs(50);
		
		s1.studentInfo();
		s1.totalScore();
		System.out.println(s1.totalScore2());
		System.out.println(s1.totalScore3());
	}
}
