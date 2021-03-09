package Chapter4;

public class Excersice06 {
	// 삼각형형태 별찍기
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"); 
				if(j==i) { //j가 i가 되는 시점에 개행해줌
					System.out.println();
				}
			}
		}

	}

}
