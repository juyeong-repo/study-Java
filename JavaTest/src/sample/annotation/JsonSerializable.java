package sample.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*1. indicate compiler that our object can be serialized. 
2. apply to the field which we wanna include JSON String
3. use annotation to initialize our object.*/

@Retention(RetentionPolicy.RUNTIME) //scope �����ֱ�. runtime�� ����
@Target(ElementType.TYPE) //Ÿ���� Ŭ����,�������̽�,enum�� �ǹ�
//runtime�� type�� apply�ϵ��� annotation
public @interface JsonSerializable {
	public String key() default ""; //empty String "key"
//caution: �Ķ���� ������ �ȵǰ�, ���� throw�ϸ� �ȵȴ�. 
//����Ÿ���� �����ڷ������� ���ѵȴ�. ��Ʈ��, Ŭ����,�̳�, ������̼�, �迭, ����Ʈ�����
//null���̸� �ȵȴ�.
	
}
