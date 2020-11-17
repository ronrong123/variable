package iteration;

public class WhileMyExample {

	public static void main(String[] args) {
		// 1~10까지 합
		int i = 0, sum = 0;
		// 브레이크포인트 : 실행되다 여기오면 멈춰주세요(더블클릭)
		// 디버깅 : 프로그램 분석 (재생버튼 옆 벌레같은 아이콘)
		while (true) {// true를 적으면 계속 반복
			sum += i;
			if (i == 10) {
				break; // if로 break해서 빠져나옴
			}
			i++;
		}
		System.out.println("1 부터 10까지 합: " + sum);

	}
}
