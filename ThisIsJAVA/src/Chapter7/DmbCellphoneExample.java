package Chapter7;

public class DmbCellphoneExample  {
	public static void main(String[] args) {
		//dmbcellphone  ��ü ����
		DmbCellPhone dmbcellphone=new DmbCellPhone("�ڹ���", "�ϴû�", 10);
		
		//cellphone ���κ��� ��ӹ��� �ʵ�
		System.out.println("��:"+dmbcellphone.model);
		System.out.println("����:"+dmbcellphone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä��:"+dmbcellphone.channel);


	 //Cellphone ���κ��� ��ӹ��� �޼ҵ� ȣ��
	 dmbcellphone.powerOn();
	 dmbcellphone.bell();
	 dmbcellphone.sendVoice("��������");
	 dmbcellphone.receiveVoice("�ȳ��ϼ��� �� A�Դϴ�.");
     dmbcellphone.sendVoice("��~");
	 dmbcellphone.hangUp();	 
	 
	 //dmbCellphone�� �޼ҵ� ȣ��
	 dmbcellphone.turnOnDmb();
	 dmbcellphone.ChargeChannelDMB(12);
	 dmbcellphone.turnOffDmb();
	}
}