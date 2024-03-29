package geektime.spring.hello.learn;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Inherited
public @interface MyAnno {
    String value() default "有注解";
}
