package Chapter7;

public class CellPhone {
	//�ʵ�
	String model;
	String color;
 
	
	//������
	
	//�޼ҵ�
	void powerOn() {
		System.out.println("������ ŵ�ϴ�");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�");
	}
	void sendVoice(String message) { //
		System.out.println("����:"+ message);
	}
	void receiveVoice(String message) {
		System.out.println("����:"+message);
	}
	void hangUp() {
		System.out.println("��ȭ �����ϴ�");
	}
	  
}

