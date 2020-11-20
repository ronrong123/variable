package bank;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {

		Customer[] customers = new Customer[100];
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.리스트 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scn.nextInt();scn.nextLine();//int는 엔터 생략이라 line으로 엔터키를 소진시키겠다.
			if (selectNo == 1) {
				// 계좌생성만들기
				System.out.println("1.계좌생성 선택했습니다.");
				System.out.print("계좌번호 입력> ");
				String accNo = scn.nextLine();// nextLine은 문자값
				System.out.print("예금주 입력> ");
				String owner = scn.nextLine();
				System.out.print("입금액 입력> ");
				int balance = scn.nextInt();
				Customer c1 = new Customer(accNo, owner, balance);
				for(int i=0;i<customers.length;i++) {
					if(customers[i]==null) { //현재있는곳이 null이면 넣겠다.
						customers[i] = c1;						
						break;
					}
				}
				System.out.println("한건 입력 완료.");
				
			} else if (selectNo == 2) {
				// 전체리스트출력
				System.out.println("2.리스트 선택했습니다.");
				for(int i=0;i<customers.length;i++) {
					if(customers[i] != null) {
						//if구문에 실행될 명령어가 하나뿐이면{}생략가능
						customers[i].showAccountInfo();						
					}
				}
			} else if (selectNo == 3) {
				// 입금				
				System.out.println("3.입금 선택했습니다.");
				System.out.println("계좌번호 선택> ");
				String accNo = scn.nextLine();
				System.out.println("입금액 입력>");
				int balance = scn.nextInt();
				for(int i=0;i<customers.length;i++) {
					if(customers[i] != null && 
					   accNo .equals(customers[i].getBankAccount())) {
						// 문자열은 == 로 비교가 불가능하기때문에  .equals를 사용
						int currentBalance = customers[i].getBalance();
						customers[i].setBalance(currentBalance + balance);
					}
				}
				
			} else if (selectNo == 4) {
				// 출금
				System.out.println("4.출력 선택했습니다.");
			} else if (selectNo == 5) {
				// 종료
				System.out.println("5.종료 선택했습니다.");
				run = false;
			}

		}//end of while
		System.out.println();
		System.out.println("프로그램 종료.");
	}
	

}
