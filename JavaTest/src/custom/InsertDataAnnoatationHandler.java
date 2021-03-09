package custom;

import java.lang.reflect.Field;

import custom.InsertIntData;

public class InsertDataAnnoatationHandler {
	public static <T> void process(T targetObj) { // Ÿ�� ������Ʈ ����/ annotationuse1�� ���� �� ����
		System.out.println(targetObj.getClass().getName()); //Ÿ�پ˾Ƴ������� ����
		Field[] fields = targetObj.getClass().getDeclaredFields(); // ��������� ������ ����(�迭)
		System.out.println(fields[0].getType()); //�ʵ�˾Ƴ������� ����
		if (fields != null && fields.length != 0) {
			InsertIntData annotation; 
			for (Field field : fields) {
				System.out.println(field); // �ʵ����
				annotation = field.getAnnotation(InsertIntData.class);
				System.out.println(annotation); //�� �̾Ƴ����� �˱����� ����, annotationuse1�� �ִ� ������̼� �̾Ƴ��� �� �� �ִ� 
				if (annotation != null && field.getType() == int.class) {
					//�����ڷ����� ��ü�ڷ����̹Ƿ� .class ��밡�� ->  field.getType() == int.class => ��Ƽ�� �ڷ������� ����� ��
					//ex. public class INTEGER { } 
					field.setAccessible(true);
					try {
						field.set(targetObj, annotation.data()); //�޾��� targetobj�� set(exam01,02-Use class) 
					} catch (IllegalArgumentException e) {
						// ���� setAccessible���� false�� ���µ� �����Ͱ� ������ �� �ߴ� exception.
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
// ��, ������ println�ؼ� custom annotation�� ���� �ƴ϶�, ����ϱ� ���ؼ� handler�� �ʿ��ϴ�. 
