package iteration;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// scanner : 사용자가 입력한 값을 읽어와서 출력
		// next : 문자, 숫자를 문자형태로 바꿔서 넣어줌
		// nextInt : 숫자만하기때문에 앞에 변수를 숫자형식으로 넣어줘야함
		Scanner scn = new Scanner(System.in);
		boolean run = true;// 참 또는 거짓
		int balance = 0;

		while (run) {
			System.out.println("----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료 ");
			System.out.println("----------------------");
			System.out.print("선택>");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("예금액> ");
				balance += scn.nextInt();
			} else if (menu == 2) {
				System.out.println("출금액> ");
				balance -= scn.nextInt();
			} else if (menu == 3) {
				System.out.println("잔고> " + balance);
			} else if (menu == 4) {
				run = false;
			}

		} // end of while
		System.out.println();
		System.out.println("프로그램 종료");

	}// end of main()

}
