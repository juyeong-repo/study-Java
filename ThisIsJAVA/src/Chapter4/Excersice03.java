package Chapter4;

public class Excersice03 {
//1부터 100까지의 정수중 3의 배수 총합 구하기
	public static void main(String[] args) {
		int sum=0; //총합은 0
      for(int i=1;i<=100;i++) { //1부터 100까지 반복해서 출력하는데
    	  if(i%3==0) { //만약 i가 3의 배수라면
    		  sum +=i ; //총합에 i를 더해 
    	  }
      }
      System.out.println(sum); //총합을 뽑아
	}
}
