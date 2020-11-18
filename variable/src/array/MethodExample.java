package array;

public class MethodExample {

	public static void main(String[] args) {
		// 두 수를 더해서 2로 나누고 50을 더하고 다시 10으로 나눔.
		int num1, num2, result;
		num1 = 34;
		num2 = 55;
		result = sumMethod(num1, num2);
		System.out.println(result);

		int val1 = 22, val2 = 55;
		result = sumMethod(val1,val2);
		System.out.println(result);
		int val3 = 24, val4 = 56;
		result = sumMethod(val3,val4);
		System.out.println(result);
		int val5 = 25, val6 = 57;
		result = sumMethod(val5,val6);
		System.out.println(result);
	}
	//메소드
	public static int sumMethod(int numb1, int numb2) { //접근제어자 반환타입 메소드이름(매개변수목록)
		int result = numb1 + numb2;
		result = result / 2;
		result = result + 50;
		result = result / 10;
		return result;
	}
}
