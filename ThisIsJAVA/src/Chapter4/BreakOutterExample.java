package Chapter4;

public class BreakOutterExample {

	public static void main(String[] args) {
		//��øfor������ lower������ 'g'�� ������ �ٱ��� for������ �����������ϱ�
		Outter: for(char upper='A'; upper<='Z'; upper++) {
				for(char lower='a'; lower<='z'; lower++) {
						System.out.println(upper+"-"+lower);
						if(lower == 'g') {
							break Outter;
						}
	}
		}
		System.out.println("���α׷� ��������");
}
}
