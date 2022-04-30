package cn.youngkbt.constants;

/**
 * @author Young Kbt
 * @date 2022/4/30 15:29
 * @description 分页枚举类
 */
public enum PageEnum {
    // 默认，升序
    ASC("asc"),
    // 降序
    DESC("desc");
    
    private final String order;
    
    private PageEnum(String order) {
        this.order = order;
    }
    
    public String getOrder() {
        return order;
    }
}
