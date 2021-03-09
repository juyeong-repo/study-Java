package Chapter4;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) { // enter키는 13,10번에 해당함.
				System.out.println("-----------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("선택:");
			} // 메뉴

			keyCode = System.in.read(); // 키보드 키 읽어줌

			if (keyCode == 49) { // 1입력받음
				speed++;
				System.out.println("현재속도:" + speed);

			} else if (keyCode == 50) { // 2
				speed--;
				System.out.println("현재속도:" + speed);

			} else if (keyCode == 51) { // 3
				run = false; // while문 종료하기위해서 false 저장
			}
		}
		System.out.println("프로그램종료");
	}

}
