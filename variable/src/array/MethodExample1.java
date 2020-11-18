package array;

public class MethodExample1 {

	public static void main(String[] args) {
		showInfo("김유진");
		showInfo("45");
		int result = showDouble(45);
		System.out.println("반환값: " + result);
		System.out.println("반환: " + showDouble(33.2));
		
		double result2 = divide(3.25,1.25);
		System.out.println(result2);

	}

	public static void showInfo(String name) {// void : 반환값이 없다 리턴구문이 없다
		System.out.println("안녕하세요. " + name + "입니다.");
	}

	public static int showDouble(int num) {
		return num * 2;
	}

	public static double showDouble(double num) {
		return num * 2;
	}

	// 정수형 변수 2개를 받아서 두수의 합을 반환해주는 메소드 (sum)
	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	// 정수형 변수 3개를 받아서 세수의 곱을 반환 메소드 (multi)
	public static int maulti(int a, int b, int c) {
		int result = 0;
		result = a * b * c;
		return result;
	}

	// double 2개를 받아서 첫번째 매개변수 / 두번째 매개변수 (divide)
	public static double divide(double d, double e) {
		double result = 0;
		result = d / e;
		
		if(d > e) {
			result = d/e;
		}else if(d < e) {
			result = e/d;
		}
		return result;
	}

}
