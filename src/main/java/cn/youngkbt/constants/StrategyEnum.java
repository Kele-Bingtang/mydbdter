package cn.youngkbt.constants;

/**
 * @author Young Kbt
 * @date 2022/4/30 15:52
 * @description 主键生成策略
 */
public enum StrategyEnum {
    
    UUID,
    AUTO_INCREMENT;
    
    private StrategyEnum() {
    }
}
