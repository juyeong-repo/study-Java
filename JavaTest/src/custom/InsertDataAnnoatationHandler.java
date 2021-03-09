package custom;

import java.lang.reflect.Field;

import custom.InsertIntData;

public class InsertDataAnnoatationHandler {
	public static <T> void process(T targetObj) { // 타겟 오브젝트 들어옴/ annotationuse1에 대한 것 들어옴
		System.out.println(targetObj.getClass().getName()); //타겟알아내기위해 찍음
		Field[] fields = targetObj.getClass().getDeclaredFields(); // 멤버변수의 갯수를 리턴(배열)
		System.out.println(fields[0].getType()); //필드알아내기위해 찍음
		if (fields != null && fields.length != 0) {
			InsertIntData annotation; 
			for (Field field : fields) {
				System.out.println(field); // 필드출력
				annotation = field.getAnnotation(InsertIntData.class);
				System.out.println(annotation); //뭐 뽑아내는지 알기위해 찍음, annotationuse1에 있는 어노테이션 뽑아냄을 알 수 있다 
				if (annotation != null && field.getType() == int.class) {
					//원시자료형도 객체자료형이므로 .class 사용가능 ->  field.getType() == int.class => 인티저 자료형인지 물어보는 것
					//ex. public class INTEGER { } 
					field.setAccessible(true);
					try {
						field.set(targetObj, annotation.data()); //받아준 targetobj를 set(exam01,02-Use class) 
					} catch (IllegalArgumentException e) {
						// 위의 setAccessible에서 false가 떴는데 데이터가 들어가려할 때 뜨는 exception.
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
// 즉, 무조건 println해서 custom annotation쓸 것이 아니라, 사용하기 위해서 handler가 필요하다. 
