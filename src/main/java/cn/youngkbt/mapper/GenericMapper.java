package cn.youngkbt.mapper;

import cn.youngkbt.annotation.Param;
import cn.youngkbt.entity.Model;
import cn.youngkbt.entity.Page;

import java.util.List;
import java.util.Map;

/**
 * @author Young Kbt
 * @date 2022/4/30 16:16
 * @description 基础 mapper 接口
 */
public interface GenericMapper<T extends Model> {

    public List<T> queryAll();
    
    public T queryById(long id);
    
    public List<T> queryListByField(String field, Object value);
    
    public List<T> queryAllByPage(Page<T> page);

    public int insert(T entity);

    public int insertBatch(List<T> list);

    public int insertSelective(T entity);

    public int update(T entity);

    public int delete(@Param("condition")Map<String,Object> params);
}
