package lamda;

public class LambdaTest2 {

	@FunctionalInterface // �Լ��� �������̽� üũ ������̼�
	public interface MyNumber {
		int get(int num1, int num2);
	}

	public static void main(String[] args) {
		MyNumber max = (x, y) -> (x >= y) ? x : y;
		MyNumber min = (x, y) -> (x <= y) ? x : y;
		int a = 10;
		int b = 30;
		System.out.println(a+" , "+b+"�� ū�� " + max.get(a, b));
		System.out.println(a+" , "+b+"�� ������ " + min.get(a, b));
	}
}