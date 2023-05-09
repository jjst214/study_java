package day15.exam02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})	//어노테이션 적용대상 지정
@Retention(RetentionPolicy.RUNTIME)	//유지정책 런타임(계속유지)
public @interface PrintAnnotation {
	//속성 타입 이름()  속성기본값 default
	String value() default "-";
	int number() default 15;
}
