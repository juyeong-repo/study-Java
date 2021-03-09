package Chapter4;

import java.util.Scanner;

public class Excersice07 {
//while문과 scanner를 이용해서 키보드로부터 입력된 데이터로 예금,출금,조회,종료 기능을 제공하는 코드 작성
	public static void main(String[] args) {
		boolean run = true;
		int balance=0;
		Scanner  sc=new Scanner(System.in);
		
		while(run){
			System.out.println("---------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료 ");
			System.out.println("--------------------------------------");
		//작성
			System.out.println("선택>");
			
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1:
				System.out.println("예금액>");
				balance +=menuNum;
				System.out.println(balance);
				break;
			case 2:
				System.out.println("출금액>");
				balance -=menuNum;
				System.out.println(balance);
				break;
			case 3:
				System.out.println("잔고>");
				System.out.println(balance);
				break;
			case 4:
				run=false;
				System.out.println("프로그램 종료");
				break;
			}
			
			
		   
		
		
		}
		
		System.out.println("프로그램 종료");
		
		
	}
	}