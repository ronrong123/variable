package iteration;

public class ForExample {

	public static void main(String[] args) {
		//반복구문
		//for : 반복문(~동안)
		int sum = 0;
		for (int i = 0; i <10; i++) { //int i가 0부터 시작해서 10보다 작을동안 1씩 증가시키며 실행(10번실행)
			sum += 10;
			System.out.println("i: " + i);
			System.out.println("sum: "+ sum);
		}//for (초기값; 종료조건; 반복실행){반복적으로 실행될 구문} 조건을 만족할때까지 실행
		//i += 2 는 2씩 증가시키는것
		System.out.println(sum);
		
	}
}
