package Chapter7;

public class DmbCellPhone extends CellPhone {
	//�ʵ�
	int channel;
	
	//������
	DmbCellPhone(String model, String color, int channel) {
		this.model=model;
		this.color=color; // cellphone���κ��� ��ӹ��� �ʵ�
		this.channel=channel; 
	}
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��"+channel+"�� ��� ������ �����մϴ�.");
		}
	void ChargeChannelDMB(int channel) {
		System.out.println("ä��"+channel+"������ �ٲߴϴ�");
	}
	void turnOffDmb() {
		System.out.println("Dmb ��� ������ ����ϴ�");
	}
	
}
