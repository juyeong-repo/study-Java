package Chapter4;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) { // enterŰ�� 13,10���� �ش���.
				System.out.println("-----------------------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("����:");
			} // �޴�

			keyCode = System.in.read(); // Ű���� Ű �о���

			if (keyCode == 49) { // 1�Է¹���
				speed++;
				System.out.println("����ӵ�:" + speed);

			} else if (keyCode == 50) { // 2
				speed--;
				System.out.println("����ӵ�:" + speed);

			} else if (keyCode == 51) { // 3
				run = false; // while�� �����ϱ����ؼ� false ����
			}
		}
		System.out.println("���α׷�����");
	}

}
