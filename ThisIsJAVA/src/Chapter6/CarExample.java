package Chapter6;

public class CarExample {

	public static void main(String[] args) {
		// 객체 생성
		Car myCar=new Car();
		
		//필드값읽기
		System.out.println("제작회사: "+myCar.company);;

		//필드값 변경
		myCar.company="비엠더블유";
		System.out.println("수정된 회사이름: "+ myCar.company);
	}

}
