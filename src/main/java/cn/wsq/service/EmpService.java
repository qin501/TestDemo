package cn.wsq.service;

import cn.wsq.common.Result;
import cn.wsq.common.TableResult;
import cn.wsq.entity.Emp;

import java.util.List;

public interface EmpService {
    /*
    * offset从第几条开始
    * limit查询多少条记录
    * */
    public TableResult<Emp> getEmpList(int offset, int limit);
    /*
    * 删除Ids集合
    * */
    public Result deleteByIds(String[] ids);
    /*
    * 保存或者是更新
    * */
    public Result saveOrUpdateEmp(Emp emp);
    /*
     * 根据Id获取
     * */
    public Emp getEmpById(String id);
    /*
     * 根据实体类对象查询
     * */
    public List<Emp> searchByEntity(Emp emp);
    /*
     * 获取所有的数据
     * */
    public List<Emp> getList();
    /*
    *分页和条件查询
    **/
    public TableResult<Emp> getSearchPage(int offset, int limit, Emp emp);

}
