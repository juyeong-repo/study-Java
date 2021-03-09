package Chapter6;

public class Member {
	String name;
	String id;
	String password;
	int age;

	//name, id 를 외부에서 받은 값으로 초기화하기 위해 생성자 선언
	
	Member(String name, String id) {
		this.name=name;
		this.id=id; //필드앞에 this.
	}
}
