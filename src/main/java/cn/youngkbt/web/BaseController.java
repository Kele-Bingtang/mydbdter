package cn.youngkbt.web;

import cn.youngkbt.constants.ResponseStatusEnum;
import cn.youngkbt.http.Response;

import java.util.Map;

/**
 * @author Young Kbt
 * @date 2022/4/30 14:55
 * @description 基础 Controller 控制器
 */
public class BaseController {
    
    public Response processResult(Object data, String message, ResponseStatusEnum status) {
        Response response = new Response();
        response.setData(data);
        response.setCodeMessage(status.getStatus());
        response.setMessage(message);
        return response;
    }

    public Response processResult(Map<String, Object> dataMap, String message, ResponseStatusEnum status) {
        Response response = new Response();
        response.setDataMap(dataMap);
        response.setCodeMessage(status.getStatus());
        response.setMessage(message);
        return response;
    }

    public Response processResult(String key, Object data, String message, ResponseStatusEnum status) {
        Response response = new Response();
        response.getDataMap().put(key, data);
        response.setCodeMessage(status.getStatus());
        response.setMessage(message);
        return response;
    }

    public Response processSuccessResult(Object data) {
        Response response = new Response();
        response.setData(data);
        response.setCodeMessage(ResponseStatusEnum.SUCCESS.getStatus());
        response.setMessage(ResponseStatusEnum.SUCCESS.getMessage());
        return response;
    }

    public Response processSuccessResult(Map<String, Object> dataMap) {
        Response response = new Response();
        response.setDataMap(dataMap);
        response.setCodeMessage(ResponseStatusEnum.SUCCESS.getStatus());
        response.setMessage(ResponseStatusEnum.SUCCESS.getMessage());
        return response;
    }

    public Response processSuccessResult(String key, Object data) {
        Response response = new Response();
        response.getDataMap().put(key, data);
        response.setCodeMessage(ResponseStatusEnum.SUCCESS.getStatus());
        response.setMessage(ResponseStatusEnum.SUCCESS.getMessage());
        return response;
    }

    public Response processErrorResult(Object data) {
        Response response = new Response();
        response.setData(data);
        response.setCodeMessage(ResponseStatusEnum.FAIL.getStatus());
        response.setMessage(ResponseStatusEnum.FAIL.getMessage());
        return response;
    }

    public Response processErrorResult(Map<String, Object> dataMap) {
        Response response = new Response();
        response.setDataMap(dataMap);
        response.setCodeMessage(ResponseStatusEnum.FAIL.getStatus());
        response.setMessage(ResponseStatusEnum.FAIL.getMessage());
        return response;
    }

    public Response processErrorResult(String key, Object data) {
        Response response = new Response();
        response.getDataMap().put(key, data);
        response.setCodeMessage(ResponseStatusEnum.FAIL.getStatus());
        response.setMessage(ResponseStatusEnum.FAIL.getMessage());
        return response;
    }
    
}
