package cn.youngkbt.annotation;

import cn.youngkbt.constants.MatchEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @author Young Kbt
 * @date 2022/4/30 15:43
 * @description 查询条件
 */

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Condition {
    
    public MatchEnum match() default MatchEnum.EQ;
    
    public String value() default "";
    
}
