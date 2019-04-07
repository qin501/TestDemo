package cn.wsq.mapper;

import cn.wsq.entity.Dept;

import java.util.List;

public interface DeptMapper {
    /*
    * 获取所有的数据
    * */
    public List<Dept> getList();
    /*
    * 根据id更新
    * */
    public void updateDept(Dept dept);
    /*
    *添加数据
    * */
    public void addDept(Dept dept);
    /*
    * 根据deptid删除数据
    * */
    public void deleteDept(Integer deptid);
    /*
    * 根据实体类对象查询
    * */
    public List<Dept> searchByEntity(Dept dept);
    /*
    * 根据Id获取
    * */
    public Dept getDeptById(Integer deptid);
}
