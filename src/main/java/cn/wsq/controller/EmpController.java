package cn.wsq.controller;

import cn.wsq.common.Result;
import cn.wsq.common.TableResult;
import cn.wsq.entity.Emp;
import cn.wsq.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    /*
    * 按分页查询
    * */
    @RequestMapping("getEmpList")
    public TableResult<Emp> getEmpList(@RequestParam(defaultValue = "0") int offset, @RequestParam(defaultValue = "10") int limit){
        TableResult<Emp> empList = empService.getEmpList(offset, limit);
        return empList;
    }
    /*
     * 删除Ids集合
     * */
    @RequestMapping("deleteEmp")
    public Result deleteByIds(String[] ids){
        Result result = empService.deleteByIds(ids);
        return result;
    }
    /*
     * 保存或者是更新
     * */
    @RequestMapping("saveOrUpdateEmp")
    public Result saveOrUpdateEmp(Emp emp){
        Result result = empService.saveOrUpdateEmp(emp);
        return result;
    }
    /*
     * 根据Id获取
     * */
    @RequestMapping("getEmpById")
    public Emp getEmpById(String id){
        Emp emp = empService.getEmpById(id);
        return emp;
    }
    /*
    * 根据实体类对象查询
    * */
    @RequestMapping("searchByEntity")
    public List<Emp> searchByEntity(Emp emp){
        List<Emp> emps = empService.searchByEntity(emp);
        return emps;
    }
    /*
    * 获取所有的数据
    * */
    @RequestMapping("getList")
    public List<Emp> getList(){
        List<Emp> list = empService.getList();
        return list;
    }
    /*
     * 分页查询和条件查询
     * */
    @RequestMapping("getSearchPage")
    public TableResult<Emp> getSearchPage(@RequestParam(defaultValue = "0") int offset, @RequestParam(defaultValue = "10") int limit,Emp emp){
        TableResult<Emp> result=empService.getSearchPage(offset,limit,emp);
        return result;
    }
}
