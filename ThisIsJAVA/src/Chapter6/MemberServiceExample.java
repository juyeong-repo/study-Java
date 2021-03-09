package Chapter6;

public class MemberServiceExample {

	public static void main(String[] args) { //실행하는 메인메소드
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("ID 또는 비밀번호가 맞지 않습니다.");
		}

	}

}
