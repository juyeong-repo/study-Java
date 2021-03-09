package Chapter5;

public class ArrayCreatedByValueListExample {
	public static void main(String[] args) {
		int[] scores; // 배열변수 선언
		scores = new int[] { 93, 87, 81 };
		
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합:" + sum1);

	
		int sum2 = add(new int[] { 93, 87, 81 });
		System.out.println("총합:" + sum2);
		System.out.println();
	}

	public static int add(int[] scores) { //총합을 계산해서 리턴하는 메소드
		int sum=0;
		for(int i=0;i<3;i++) {
			sum+=scores[i];
		}
		return sum;
	}


}
