package cn.youngkbt.annotation;

import cn.youngkbt.constants.StrategyEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @author Young Kbt
 * @date 2022/4/30 15:51
 * @description 数据生成策略
 */

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GeneratedValue {
    
    public StrategyEnum strategy() default StrategyEnum.UUID;
    
}
