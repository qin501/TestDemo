package cn.wsq.service.impl;

import cn.wsq.common.Result;
import cn.wsq.common.TableResult;
import cn.wsq.common.TrimSpace;
import cn.wsq.entity.Emp;
import cn.wsq.mapper.EmpMapper;
import cn.wsq.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    /*
    * offset从第几条开始
    * limit查询多少条记录
    * */
    @Override
    public TableResult<Emp> getEmpList(int offset, int limit) {
        //int pageNum, int pageSize
        //offset=(pageNum-1)*limit
        try {
            PageHelper.startPage(offset / limit + 1, limit);
            List<Emp> empList = empMapper.getList();
            PageInfo pageInfo = new PageInfo(empList);
            TableResult<Emp> result = new TableResult<Emp>();
            result.setRows(empList);
            result.setTotal((int) pageInfo.getTotal());
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    @Transactional
    public Result deleteByIds(String[] ids) {
        for (int i = 0; i < ids.length; i++) {
            empMapper.deleteEmp(ids[i]);
        }
        return new Result(200,"成功了");
    }

    @Override
    @Transactional
    public Result saveOrUpdateEmp(Emp emp) {
       TrimSpace.trim(emp);
        if (emp!=null){
            //更新
            if(emp.getEmpid()!=null){
                empMapper.updateEmp(emp);
            //保存
            }else {
                empMapper.addEmp(emp);
            }
        }
        return new Result(200,"成功了");
    }

    @Override
    public Emp getEmpById(String id) {
        Emp emp = empMapper.getEmpById(id);
        return emp;
    }

    @Override
    public List<Emp> searchByEntity(Emp emp) {
        TrimSpace.trim(emp);
        List<Emp> emps = empMapper.searchByEntity(emp);
        return emps;
    }

    @Override
    public List<Emp> getList() {
        List<Emp> list = empMapper.getList();
        return list;
    }
    @Override
    public TableResult<Emp> getSearchPage(int offset, int limit, Emp emp) {
        TrimSpace.trim(emp);
        try {
            PageHelper.startPage(offset / limit + 1, limit);
            List<Emp> empList=new ArrayList<Emp>();
            if(emp==null){
                empList = empMapper.getList();
            }else{
                empList = empMapper.searchByEntity(emp);
            }
            PageInfo pageInfo = new PageInfo(empList);
            TableResult<Emp> result = new TableResult<Emp>();
            result.setRows(empList);
            result.setTotal((int) pageInfo.getTotal());
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
