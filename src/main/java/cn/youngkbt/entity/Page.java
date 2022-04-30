package cn.youngkbt.entity;

import cn.youngkbt.constants.PageEnum;

/**
 * @author Young Kbt
 * @date 2022/4/30 14:59
 * @description 分页类
 */
public class Page<T> implements IPage<T>{
    // 当前页数
    private int curPageNum = 0;
    // 显示页数
    private int pageSize = 10;
    // 总记录数
    private int totalPageNum;
    // 总页数
    private int pages;
    // 数据
    private T data;
    // 请求的 url
    private String url;
    // 排序
    private String order = PageEnum.ASC.getOrder();
    
    @Override
    public int getBeginPageNum() {
        if(curPageNum < 1) {
            return 0;
        }
        return (curPageNum - 1) * pageSize;
    }

    public int getCurPageNum() {
        return curPageNum;
    }

    public void setCurPageNum(int curPageNum) {
        this.curPageNum = curPageNum;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPageNum() {
        return totalPageNum;
    }

    public void setTotalPageNum(int totalPageNum) {
        this.totalPageNum = totalPageNum;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
