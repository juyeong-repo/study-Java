package Chapter6;

public class MemberServiceExample {

	public static void main(String[] args) { //�����ϴ� ���θ޼ҵ�
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		} else {
			System.out.println("ID �Ǵ� ��й�ȣ�� ���� �ʽ��ϴ�.");
		}

	}

}