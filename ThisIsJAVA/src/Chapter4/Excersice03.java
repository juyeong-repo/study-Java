package Chapter4;

public class Excersice03 {
//1���� 100������ ������ 3�� ��� ���� ���ϱ�
	public static void main(String[] args) {
		int sum=0; //������ 0
      for(int i=1;i<=100;i++) { //1���� 100���� �ݺ��ؼ� ����ϴµ�
    	  if(i%3==0) { //���� i�� 3�� ������
    		  sum +=i ; //���տ� i�� ���� 
    	  }
      }
      System.out.println(sum); //������ �̾�
	}
}
