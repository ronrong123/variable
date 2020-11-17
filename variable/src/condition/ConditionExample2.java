package condition;

public class ConditionExample2 {

	public static void main(String[] args) {
	
		int num1 =45;
		
		if(num1%3 == 0 && num1%5 == 0) { //&&는 좌항과 우항의 값이 모두 참(true)일 때 참이 된다.   
			System.out.println("3과 5의 공통배수입니다.");
		}else if(num1%5 == 0) {
			System.out.println("5의 배수입니다.");
		}else if(num1%3 ==0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("기타입니다.");
		}

	}
}
