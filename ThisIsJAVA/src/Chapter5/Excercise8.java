package Chapter5;

/*��øfor�� �̿��Ͽ� �־��� �迭�� ��ü�׸� �հ� ��հ� ���ϱ�   */
public class Excercise8 {
	public static void main(String[] args) {
		int[][] arr = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		//0 �ε����� 2��, 1 �ε����� 3��, 2�ε����� 5��
		int sum=0;
		double avg=0.0;
         
		int count =0; //����
		for(int i=0;i<arr.length;i++) { //1���� �׸��� �迭����ŭ
			for(int j=0; j<arr[i].length ;j++) { //�� �ε����� length��ŭ ����
				sum+=arr[i][j];
				count++;
			}
		}
		
		
		avg= (double)sum/count;

		System.out.println("����: "+sum);
		System.out.println("���: "+avg);

	}

}
