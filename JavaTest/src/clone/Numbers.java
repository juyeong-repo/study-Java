package clone;

public class Numbers implements Cloneable {
	private int[] numbers=null;
	
	public Numbers() {
		numbers=new int[10];
	}//�����迭 numbers�� ���۷������� ����(��ü�� �����ϰ� ���ο� �迭����x)
	
	public Object clone() throws CloneNotSupportedException{
		Numbers obj=(Numbers)super.clone(); // Object.clone()�޼ҵ� ȣ���Ͽ� ������ ��ü���� ����
		obj.numbers = (int[])numbers.clone(); //�迭�� Ŭ�δ�
		return obj;
	}
}
//Numbers obj=super.clone(); type mismatch����
