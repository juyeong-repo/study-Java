package Chapter5;

import java.util.Scanner;

/*  키보드로 점수 입력받아 최고점수,평균점수 구하기*/
public class Excercise9 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;

		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("_________________________________________________________");
			System.out.println("1: 학생수 | 2: 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("_________________________________________________________");
			System.out.print("선택>");
		

		int selectNo = sc.nextInt();

		if (selectNo == 1) {
			System.out.print("학생수>");
			studentNum = sc.nextInt();
			scores= new int[studentNum]; //학생수를 매개변수로 가지는 배열 생성
	
		} else if (selectNo == 2) {
			for(int i=0; i<scores.length;i++){ //사용자가 값 입력하도록 for문
			System.out.print("scores["+ i +"]>");
			scores[i] = sc.nextInt();
			}
		
		} else if (selectNo == 3) {
			for(int i=0; i<scores.length;i++){
			System.out.println("scores["+ i +"]:"+scores[i]); //i번째 값 출력
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
		    System.out.println("최고 점수:"+ max);
		    System.out.println("평균 점수:"+ avg);
		} else if (selectNo == 5) {
			run = false;
		
		}
		}

		System.out.println("프로그램 종료");
	}
	}

