package Chapter4;
/*
 * �ΰ��� �ֻ����� ������ �� ������ ���� ��1,��2 ���·� ����ϰ�, 
 * ���� ���� 5�̸� ��������
 * �ۼ��ϱ� 5�� �Ǵ� ������ 1,4/ 4,1 /2,3/ 3,2
 */

public class Excersice04 {
	public static void main(String[] args) {
		while(true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("("+num1+","+num2+")");
			
			if(num1+num2==5) { 
				break;
			}
			
		}

}}
