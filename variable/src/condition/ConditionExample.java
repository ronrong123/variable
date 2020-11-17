package condition;

public class ConditionExample {

	public static void main(String[] args) {
		int score = 86;
		String grade = "";

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			} // if 안에 if 가능
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";

			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		// 70점 이상 C, 60점 이상 D, 60점미만은 F
		System.out.println(score + "점은" + grade + "입니다.");
	}

}
