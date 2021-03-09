package Chapter6;

//외부에서 객체 생성하지 않고 println 메소드 수행하기 위해 정적멤버로 선언
public class Printer2 {
	static void println(int value) {
		System.out.println(value);
	}

	static void println(boolean value) {
		System.out.println(value);
	}

	static void println(double value) {
		System.out.println(value);
	}

	static void println(String value) {
		System.out.println(value);
	}
}
