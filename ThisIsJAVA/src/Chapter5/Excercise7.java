package Chapter5;

/*for�� �̿��Ͽ� �迭�� �׸� �� �ִ� ���ϱ�*/
public class Excercise7 {
	public static void main(String[] args) {
		int max=0;
		int[] array= {1,2,3,4,5};
		
		for(int i=0; i<array.length;i++) {
			if(max< array[i]) {
				max=array[i];
			}
		}
		System.out.println("max: "+ max);
	}

}
