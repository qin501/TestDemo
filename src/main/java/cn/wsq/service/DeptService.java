package cn.wsq.service;

import cn.wsq.common.Result;
import cn.wsq.common.TableResult;
import cn.wsq.entity.Dept;

import java.util.List;

public interface DeptService {
    /*
    * offset从第几条开始
    * limit查询多少条记录
    * */
    public TableResult<Dept> getDeptList(int offset, int limit);
    /*
    * 删除Ids集合
    * */
    public Result deleteByIds(Integer[] ids);
    /*
    * 保存或者是更新
    * */
    public Result saveOrUpdateDept(Dept dept);
    /*
     * 根据Id获取
     * */
    public Dept getDeptById(Integer id);
    /*
     * 根据实体类对象查询
     * */
    public List<Dept> searchByEntity(Dept dept);
    /*
     * 获取所有的数据
     * */
    public List<Dept> getList();
    /*
    *分页和条件查询
    **/
    public TableResult<Dept> getSearchPage(int offset, int limit, Dept dept);

}
