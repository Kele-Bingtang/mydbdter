package cn.youngkbt.service;

import cn.youngkbt.entity.Model;
import cn.youngkbt.entity.Page;

import java.util.List;

/**
 * @author Young Kbt
 * @date 2022/4/30 16:07
 * @description 基础 service 接口
 */
public interface GenericService<T extends Model> {
    
    // 查询所有数据记录
    public List<T> queryAll();
    // 根据 id 查询数据记录
    public T queryById(long id);
    // 根据字段查询数据记录
    public List<T> queryListByField(String field, Object value);
    // 分页查询数据记录
    public List<T> queryAllByPage(Page<T> page);
    
    // 插入数据记录
    public int insert(T entity);
    // 根据 id 更新数据记录
    public int updateById(T entity);
    // 批量插入数据记录
    public int insertBatch(List<T> entities);
    
    // 更新数据记录
    public int update(T entity);
    // 批量更新数据记录
    public int updateBatch(List<T> entities);
    
    // 删除数据记录
    public int delete(long id);
    // 根据 id 删除数据记录
    public int deleteById(long id);
    // 根据 id 批量删除数据记录
    public int deleteByIds(long[] ids);
    
    // 查询数据记录总数
    public int countAll();
    // 根据 id 查询数据记录是否存在
    public boolean existsById(long id);
    
}
