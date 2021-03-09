package Chapter4;
/*
 * 두개의 주사위를 던졌을 때 나오는 눈을 눈1,눈2 형태로 출력하고, 
 * 눈의 합이 5이면 실행종료
 * 작성하기 5가 되는 조합은 1,4/ 4,1 /2,3/ 3,2
 */

public class Excersice04 {
	public static void main(String[] args) {
		while(true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("("+num1+","+num2+")");
			
			if(num1+num2==5) { 
				break;
			}
			
		}

}}
