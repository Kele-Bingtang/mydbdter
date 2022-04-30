package cn.youngkbt.annotation;

import cn.youngkbt.constants.StatisticsEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @author Young Kbt
 * @date 2022/4/30 15:55
 * @description 用于标记字段是否为统计字段，且统计字段的类型
 */

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Statistics {
    StatisticsEnum[] type() default StatisticsEnum.count;
}
