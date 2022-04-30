package cn.youngkbt.http;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Young Kbt
 * @date 2022/4/30 14:47
 * @description 响应对象
 */
public class Response implements Serializable {
    private static final long serialVersionUID = -464624820023286858L;
    // 状态码信息
    protected String codeMessage;
    // 消息
    private String message;
    // 数据
    protected Object data;
    // key-value 数据
    protected Map<String, Object> dataMap;
    
    public Response() {
        dataMap = new HashMap<>();
    }

    public String getCodeMessage() {
        return codeMessage;
    }

    public void setCodeMessage(String codeMessage) {
        this.codeMessage = codeMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Map<String, Object> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
    }
}
