package lamda;

public class LambdaTest2 {

	@FunctionalInterface // 함수형 인터페이스 체크 어노테이션
	public interface MyNumber {
		int get(int num1, int num2);
	}

	public static void main(String[] args) {
		MyNumber max = (x, y) -> (x >= y) ? x : y;
		MyNumber min = (x, y) -> (x <= y) ? x : y;
		int a = 10;
		int b = 30;
		System.out.println(a+" , "+b+"중 큰수 " + max.get(a, b));
		System.out.println(a+" , "+b+"중 작은수 " + min.get(a, b));
	}
}