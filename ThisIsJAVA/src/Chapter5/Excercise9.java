package Chapter5;

import java.util.Scanner;

/*  Ű����� ���� �Է¹޾� �ְ�����,������� ���ϱ�*/
public class Excercise9 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;

		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("_________________________________________________________");
			System.out.println("1: �л��� | 2: �����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("_________________________________________________________");
			System.out.print("����>");
		

		int selectNo = sc.nextInt();

		if (selectNo == 1) {
			System.out.print("�л���>");
			studentNum = sc.nextInt();
			scores= new int[studentNum]; //�л����� �Ű������� ������ �迭 ����
	
		} else if (selectNo == 2) {
			for(int i=0; i<scores.length;i++){ //����ڰ� �� �Է��ϵ��� for��
			System.out.print("scores["+ i +"]>");
			scores[i] = sc.nextInt();
			}
		
		} else if (selectNo == 3) {
			for(int i=0; i<scores.length;i++){
			System.out.println("scores["+ i +"]:"+scores[i]); //i��° �� ���
			}
	
		} else if (selectNo == 4) {
			int max=0;
		    int sum=0;
		    double avg=0;
		    for(int i=0; i<scores.length;i++) {
		    	max=(max<scores[i])?scores[i]:max;
		    	sum+=scores[i];
		    }
		    avg=(double) sum/studentNum;
		    System.out.println("�ְ� ����:"+ max);
		    System.out.println("��� ����:"+ avg);
		} else if (selectNo == 5) {
			run = false;
		
		}
		}

		System.out.println("���α׷� ����");
	}
	}
