package cn.youngkbt.constants;

/**
 * @author Young Kbt
 * @date 2022/4/30 15:45
 * @description 匹配类型
 */
public enum MatchEnum {

    EQ("="),
    GT(">"),
    LT("<"),
    GTEQ(">="),
    LTEQ("<="),
    LIKE("like"),
    LLIKE("llike"),
    RLIKE("rlike"),
    RANGE("range"),
    IN("in");

    private String type;

    private MatchEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
}
