package cn.wsq.controller;

import cn.wsq.common.Result;
import cn.wsq.common.TableResult;
import cn.wsq.entity.Dept;
import cn.wsq.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    /*
    * 按分页查询
    * */
    @RequestMapping("getDeptList")
    public TableResult<Dept> getDeptList(@RequestParam(defaultValue = "0") int offset, @RequestParam(defaultValue = "10") int limit){
        TableResult<Dept> deptList = deptService.getDeptList(offset, limit);
        return deptList;
    }
    /*
     * 删除Ids集合
     * */
    @RequestMapping("deleteDept")
    public Result deleteByIds(Integer[] ids){
        Result result = deptService.deleteByIds(ids);
        return result;
    }
    /*
     * 保存或者是更新
     * */
    @RequestMapping("saveOrUpdateDept")
    public Result saveOrUpdateDept(Dept dept){
        Result result = deptService.saveOrUpdateDept(dept);
        return result;
    }
    /*
     * 根据Id获取
     * */
    @RequestMapping("getDeptById")
    public Dept getDeptById(Integer id){
        Dept dept = deptService.getDeptById(id);
        return dept;
    }
    /*
    * 根据实体类对象查询
    * */
    @RequestMapping("searchByEntity")
    public List<Dept> searchByEntity(Dept dept){
        List<Dept> depts = deptService.searchByEntity(dept);
        return depts;
    }
    /*
    * 获取所有的数据
    * */
    @RequestMapping("getList")
    public List<Dept> getList(){
        List<Dept> list = deptService.getList();
        return list;
    }
    /*
     * 分页查询和条件查询
     * */
    @RequestMapping("getSearchPage")
    public TableResult<Dept> getSearchPage(@RequestParam(defaultValue = "0") int offset, @RequestParam(defaultValue = "10") int limit,Dept dept){
        TableResult<Dept> result=deptService.getSearchPage(offset,limit,dept);
        return result;
    }
}
