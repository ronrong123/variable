package variable;

public class OperatorExample2 {

	public static void main(String[] args) {

		int num1 = 3;

		int result = 0;

		if (num1 % 2 == 0) {
			result = 0;
		} else {
			result = 1;
		}
		System.out.println(result);

		num1 = 2;
		result = (num1 % 2) == 0 ? 0 : 1;
		System.out.println(result);

		boolean result1 = true;

		if (num1 % 2 == 0) {
			System.out.println(result1);
		} else {
			System.out.println(!result1);
		}

		num1 = 3;
		result1 = (num1 % 2) == 0 ? true : false;
		System.out.println(result1);

		num1 = 2;
		String result2 = (num1 % 2) == 0 ? "짝수입니다." : "홀수입니다.";
		System.out.println(result2);
	}
}
