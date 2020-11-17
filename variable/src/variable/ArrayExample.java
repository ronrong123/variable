package variable;

public class ArrayExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int[] numbers = { 10, 20, 30, 40, 50 };// [] : 배열기호
		numbers[1] = 200; // 선택해서 수정도 가능
		System.out.println(numbers[1]); // numbers의 n번째 값 [배열의 순서를 적어 출력] _ 인덱스 값은 0부터 시작함

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
			sum += numbers[i];
		}
		System.out.println("합: " + sum);

		String[] strings = {"Hello", "world", "Nice", "To", "Meet"};
		strings[2]= "Good";
		for(int i=0;i<strings.length;i++){
			System.out.println(strings[i]);
		}//length : 안에있는 배열의 수
	}

}
