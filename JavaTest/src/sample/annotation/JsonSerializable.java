package sample.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*1. indicate compiler that our object can be serialized. 
2. apply to the field which we wanna include JSON String
3. use annotation to initialize our object.*/

@Retention(RetentionPolicy.RUNTIME) //scope 정해주기. runtime에 실행
@Target(ElementType.TYPE) //타입은 클래스,인터페이스,enum을 의미
//runtime에 type에 apply하도록 annotation
public @interface JsonSerializable {
	public String key() default ""; //empty String "key"
//caution: 파라미터 있으면 안되고, 예외 throw하면 안된다. 
//리턴타입은 원시자료형으로 제한된다. 쓰트링, 클래스,이넘, 어노테이션, 배열, 디폴트밸류는
//null값이면 안된다.
	
}
