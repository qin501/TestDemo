package cn.wsq.mapper;

import cn.wsq.entity.Emp;

import java.util.List;

public interface EmpMapper {
    /*
    * 获取所有的数据
    * */
    public List<Emp> getList();
    /*
    * 根据id更新
    * */
    public void updateEmp(Emp emp);
    /*
    *添加数据
    * */
    public void addEmp(Emp emp);
    /*
    * 根据empid删除数据
    * */
    public void deleteEmp(String empid);
    /*
    * 根据实体类对象查询
    * */
    public List<Emp> searchByEntity(Emp emp);
    /*
    * 根据Id获取
    * */
    public Emp getEmpById(String empid);
}
