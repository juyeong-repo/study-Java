package lamda;

public class ThreadLambdaTest {
	public static void main(String[] args) {
		Thread thread1 = new MyThread();
		thread1.start();
		//////////////////////////////////

		Thread thread2 = new Thread() {
			public void run() {
				System.out.println("Hello World!!#1");
			}
		};
		thread2.start();
		//////////////////////////////////

		new Thread(() -> { // 다시 익명이너클래스를 만들어준다.
			System.out.println("Hello World!!#2");
		}).start();

	}
}

	class MyThread extends Thread { //아우터클래스.퍼블릭하지 않다. 
		//MyThread를 사용하는 곳에서도 오류가 뜬다. default 하기 때문에 패키지가 달라지면 쓸 수 없다. 
	public void run() {
		System.out.println("Hello World!!#3");
	}

}
