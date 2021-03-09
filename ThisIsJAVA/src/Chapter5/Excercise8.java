package Chapter5;

/*중첩for문 이용하여 주어진 배열의 전체항목 합과 평균값 구하기   */
public class Excercise8 {
	public static void main(String[] args) {
		int[][] arr = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		//0 인덱스에 2개, 1 인덱스에 3개, 2인덱스에 5개
		int sum=0;
		double avg=0.0;
         
		int count =0; //갯수
		for(int i=0;i<arr.length;i++) { //1차원 항목의 배열수만큼
			for(int j=0; j<arr[i].length ;j++) { //각 인덱스의 length만큼 돌아
				sum+=arr[i][j];
				count++;
			}
		}
		
		
		avg= (double)sum/count;

		System.out.println("총합: "+sum);
		System.out.println("평균: "+avg);

	}

}
