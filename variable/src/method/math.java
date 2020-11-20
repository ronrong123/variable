package method;

public class math {

	private double pi = 3.14;

	public int sum(int a, int b) {// 정의문
		return a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}

	public double getArea(double a) {
		return a * a * pi;
	}

	public double getRectangle(double r) {
		return r * r;
	}

	public double getRectangle(double r, double e) {
		return r * e;
	}

	// int 배열의 합 구하는 메소드.
	public int getArysum(int[] ary) {
		int sum = 0;
		for (int num : ary) {
			sum += num;
		}
		return sum;
	}

	// 사람의 적정 몸무게 구하는 메소드.(person)
	public double getProperWeight(person per1) {//person 클래스에 per1이라는 변수생성
		// (키 -100) * 0.9
		double properweight = (per1.height - 100) * 0.9;
		return properweight;		
	}
	public double getProperWeight(double height) {
		// (키 -100) * 0.9
		double properweight = (height - 100) * 0.9;
		return properweight;		
	}
}
