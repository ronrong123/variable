package iteration;

public class ForMultiTable {
	public static void main(String[] args) {
		
		for (int num = 2; num <= 9; num++) {
			System.out.println("[" + num + "단]");
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " x " + i + " = " + (num * i));
			}
		}//반복문 안에 반복문 가능

		
	}

}
