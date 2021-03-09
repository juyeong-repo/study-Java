package lamda;

public class Person {
	public void hi(Say line) { //인터페이스 say를 구현. hi메소드에 line 멤버필드를 넣어준다. 
		//그럼 line은 int a, int b형태를 갖겠다고 알 수 있음.
		int number = line.something(3,4);
		System.out.println("Number is "+number);
	    }
	}

