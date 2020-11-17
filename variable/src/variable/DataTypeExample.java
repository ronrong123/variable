package variable;

public class DataTypeExample {

	public static void main(String[] args) {
		byte num1 = 12;// 127까지 담음
		short num2 = 128;
		int num3 = 10000;
		long num4 = 1000000000000000L;// 끝에 L을 적어야함

		byte val1 = 10;
		num3 = val1;// promotion :자동으로행변환

		byte result = (byte) (num1 + val1);// casting
		// byte는 더하기할떄 앞에 byte를 추가해야함

		num1 = 120;
		num1++;// 증가연산자를 썼을때 그대로 byte타입
		// byte는 -128~127까지 가능
		for (int i = 0; i < 20; i++) {
			System.out.println(num1++);
		}

		char char1 = 65;
		// char : 알파벳에 해당하는 숫자값이 담겨져있음
		for (int i = 0; i < 26; i++) {
			System.out.println(char1++);
		}

		float floatVal = 4.567F;// float : 끝에 F를 적어야함.
		double doubleVal = 3.4567;

	}

}
