package array;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true; // boolean은 true랑 false를 나타내는것
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();
			// .nextInt() : 값을 읽어서 정수값을 리턴해줌

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum += scanner.nextInt();
				scores = new int[studentNum];
				System.out.println("배열크기: " + scores.length);
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores" + "[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores" + "[" + i + "]> " + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum2 = 0;
				for (int i = 0; i < scores.length; i++) {
					sum2 += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (double) sum2 / scores.length);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println();
		System.out.println("프로그램 종료");

	}
}
