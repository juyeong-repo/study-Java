package Chapter6;

public class StudentExample {
	public static void main(String[] args) {
		Student s1=new Student();
		//student 클래스를 선언하고 StudentExample 클래스의 main()메소드에서 Student 객체 생성
		System.out.println("s1 변수가 student 객체를 참조합니다.");
		
		Student s2=new Student();
		System.out.println("s2 변수가 student 객체를 참조합니다.");
	}
}
