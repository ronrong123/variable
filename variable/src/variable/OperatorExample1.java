package variable;

public class OperatorExample1 {
	public static void main(String[] args) {
		String str = "Hello";
		str += " World";//+= 뒤에값을 담아서 출력하겠다.
		System.out.println(str);

		int num1 = 10;
		num1 += 5;
		num1 -= 3;
		num1 *= 5;
		num1 /= 6;
		System.out.println("num1: " + num1);
		
		int num2 = 10;
		num2++; //++는 1을 증가
		num2--; //--는 1을 뺌
		num2--;
		num2--;
		num2--;
		System.out.println("num2: " + num2);
		
		int num3 = 10;
		num3 -= 5;
		num3 -= 5;
		num3 -= 5;
		num3 += 5;
		
		
		if(num3 > 0) {
			System.out.println("num3은 0보다 큽니다.");
		}else if(num3 < 0) {
			System.out.println("num3은 0보다 작습니다.");
		}else {
			System.out.println("num3은 0입니다.");
		}
		
		int num4 = 30;
		num4 /= 2;	
		
		//==비교연산자 
//		if(num4 % 2 == 0) {//2로 나누었을때 나머지가 0이면~
//			System.out.println("num4는 짝수입니다.");
//		}else {
//			System.out.println("num4는 홀수입니다.");
//		}
		
		boolean result = true;
		String result1 = (num4 % 2) == 0 ? "True" : "False"; //if를 간단하게적기  할당연산자
		System.out.println(result1);
		
	}
}
