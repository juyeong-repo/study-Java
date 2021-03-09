package Chapter5;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "박주영";
		String strVar2 = "박주영";

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음"); //ㅇ
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 참조가 같음"); //ㅇ
		}

		String strVar3 = new String("박주영");
		String strVar4 = new String("박주영");

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름"); //ㅇ
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 참조가 같음"); //ㅇ 
		}

	}

}
