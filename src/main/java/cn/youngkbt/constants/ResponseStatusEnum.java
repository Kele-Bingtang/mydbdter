package cn.youngkbt.constants;

/**
 * @author Young Kbt
 * @date 2022/4/30 15:19
 * @description 响应状态枚举类
 */
public enum ResponseStatusEnum {
    SUCCESS("success", "操作成功！"),
    FAIL("fail", "操作失败！"),
    ERROR("error", "操作错误！");
    
    private String status;
    
    private String message;
    
    private ResponseStatusEnum(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
