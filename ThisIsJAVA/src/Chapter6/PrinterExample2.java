package Chapter6;

//클래스 이름으로 접근하는 멤버는 static멤버뿐 
public class PrinterExample2 {
	public static void main(String[] args) {
		Printer2.println(10);
		Printer2.println(true);
		Printer2.println(5.7);
		Printer2.println("박주영");

	}
}
