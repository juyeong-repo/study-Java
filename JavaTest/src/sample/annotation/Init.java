package sample.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//제이슨으로 직렬화하기 전에 객체를 initialize하자
//이 메소드를 나타내는 어노테이션 만들기
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Init {

}
