package Chapter5;

/*for문 이용하여 배열의 항목 중 최댓값 구하기*/
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
