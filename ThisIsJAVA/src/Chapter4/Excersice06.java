package Chapter4;

public class Excersice06 {
	// �ﰢ������ �����
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"); 
				if(j==i) { //j�� i�� �Ǵ� ������ ��������
					System.out.println();
				}
			}
		}

	}

}
