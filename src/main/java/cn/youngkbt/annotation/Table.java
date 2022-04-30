package cn.youngkbt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @author Young Kbt
 * @date 2022/4/30 15:59
 * @description 数据库的表，用于类上的注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {

    String name() default "";
    
}
