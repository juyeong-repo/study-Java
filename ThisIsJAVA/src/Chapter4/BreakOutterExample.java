package Chapter4;

public class BreakOutterExample {

	public static void main(String[] args) {
		//중첩for문에서 lower변수가 'g'를 가지면 바깥쪽 for문까지 빠져나오게하기
		Outter: for(char upper='A'; upper<='Z'; upper++) {
				for(char lower='a'; lower<='z'; lower++) {
						System.out.println(upper+"-"+lower);
						if(lower == 'g') {
							break Outter;
						}
	}
		}
		System.out.println("프로그램 실행종료");
}
}
