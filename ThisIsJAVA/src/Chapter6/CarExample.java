package Chapter6;

public class CarExample {

	public static void main(String[] args) {
		// ��ü ����
		Car myCar=new Car();
		
		//�ʵ尪�б�
		System.out.println("����ȸ��: "+myCar.company);;

		//�ʵ尪 ����
		myCar.company="�񿥴�����";
		System.out.println("������ ȸ���̸�: "+ myCar.company);
	}

}
