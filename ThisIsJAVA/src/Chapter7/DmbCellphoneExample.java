package Chapter7;

public class DmbCellphoneExample  {
	public static void main(String[] args) {
		//dmbcellphone  객체 생성
		DmbCellPhone dmbcellphone=new DmbCellPhone("자바폰", "하늘색", 10);
		
		//cellphone 으로부터 상속받은 필드
		System.out.println("모델:"+dmbcellphone.model);
		System.out.println("색상:"+dmbcellphone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널:"+dmbcellphone.channel);


	 //Cellphone 으로부터 상속받은 메소드 호출
	 dmbcellphone.powerOn();
	 dmbcellphone.bell();
	 dmbcellphone.sendVoice("여보세요");
	 dmbcellphone.receiveVoice("안녕하세요 저 A입니다.");
     dmbcellphone.sendVoice("네~");
	 dmbcellphone.hangUp();	 
	 
	 //dmbCellphone의 메소드 호출
	 dmbcellphone.turnOnDmb();
	 dmbcellphone.ChargeChannelDMB(12);
	 dmbcellphone.turnOffDmb();
	}
}