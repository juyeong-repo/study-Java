package Chapter5;

public class ArrayCreatedByValueListExample {
	public static void main(String[] args) {
		int[] scores; // �迭���� ����
		scores = new int[] { 93, 87, 81 };
		
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("����:" + sum1);

	
		int sum2 = add(new int[] { 93, 87, 81 });
		System.out.println("����:" + sum2);
		System.out.println();
	}

	public static int add(int[] scores) { //������ ����ؼ� �����ϴ� �޼ҵ�
		int sum=0;
		for(int i=0;i<3;i++) {
			sum+=scores[i];
		}
		return sum;
	}


}
