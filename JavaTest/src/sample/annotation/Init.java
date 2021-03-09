package sample.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//���̽����� ����ȭ�ϱ� ���� ��ü�� initialize����
//�� �޼ҵ带 ��Ÿ���� ������̼� �����
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Init {

}
