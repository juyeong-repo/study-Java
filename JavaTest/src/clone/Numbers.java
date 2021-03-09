package clone;

public class Numbers implements Cloneable {
	private int[] numbers=null;
	
	public Numbers() {
		numbers=new int[10];
	}//원본배열 numbers의 레퍼런스값만 복사(객체만 복사하고 새로운 배열생성x)
	
	public Object clone() throws CloneNotSupportedException{
		Numbers obj=(Numbers)super.clone(); // Object.clone()메소드 호출하여 완전한 객체구조 복사
		obj.numbers = (int[])numbers.clone(); //배열을 클로닝
		return obj;
	}
}
//Numbers obj=super.clone(); type mismatch에러
