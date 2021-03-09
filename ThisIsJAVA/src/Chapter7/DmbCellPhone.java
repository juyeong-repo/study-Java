package Chapter7;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		this.model=model;
		this.color=color; // cellphone으로부터 상속받은 필드
		this.channel=channel; 
	}
	//메소드
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 방송 수신을 시작합니다.");
		}
	void ChargeChannelDMB(int channel) {
		System.out.println("채널"+channel+"번으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println("Dmb 방송 수신을 멈춥니다");
	}
	
}
