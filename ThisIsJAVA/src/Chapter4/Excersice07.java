package Chapter4;

import java.util.Scanner;

public class Excersice07 {
//while���� scanner�� �̿��ؼ� Ű����κ��� �Էµ� �����ͷ� ����,���,��ȸ,���� ����� �����ϴ� �ڵ� �ۼ�
	public static void main(String[] args) {
		boolean run = true;
		int balance=0;
		Scanner  sc=new Scanner(System.in);
		
		while(run){
			System.out.println("---------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4. ���� ");
			System.out.println("--------------------------------------");
		//�ۼ�
			System.out.println("����>");
			
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1:
				System.out.println("���ݾ�>");
				balance +=menuNum;
				System.out.println(balance);
				break;
			case 2:
				System.out.println("��ݾ�>");
				balance -=menuNum;
				System.out.println(balance);
				break;
			case 3:
				System.out.println("�ܰ�>");
				System.out.println(balance);
				break;
			case 4:
				run=false;
				System.out.println("���α׷� ����");
				break;
			}
			
			
		   
		
		
		}
		
		System.out.println("���α׷� ����");
		
		
	}
	}