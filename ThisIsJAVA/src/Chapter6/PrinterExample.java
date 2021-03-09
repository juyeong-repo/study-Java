package Chapter6;

public class PrinterExample {
//메소드 오버로딩 연습
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("박주영");
	}
}
