package cn.wsq.service.impl;

import cn.wsq.common.Result;
import cn.wsq.common.TableResult;
import cn.wsq.common.TrimSpace;
import cn.wsq.entity.Dept;
import cn.wsq.mapper.DeptMapper;
import cn.wsq.service.DeptService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    /*
    * offset从第几条开始
    * limit查询多少条记录
    * */
    @Override
    public TableResult<Dept> getDeptList(int offset, int limit) {
        //int pageNum, int pageSize
        //offset=(pageNum-1)*limit
        try {
            PageHelper.startPage(offset / limit + 1, limit);
            List<Dept> deptList = deptMapper.getList();
            PageInfo pageInfo = new PageInfo(deptList);
            TableResult<Dept> result = new TableResult<Dept>();
            result.setRows(deptList);
            result.setTotal((int) pageInfo.getTotal());
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    @Transactional
    public Result deleteByIds(Integer[] ids) {
        for (int i = 0; i < ids.length; i++) {
            deptMapper.deleteDept(ids[i]);
        }
        return new Result(200,"成功了");
    }

    @Override
    @Transactional
    public Result saveOrUpdateDept(Dept dept) {
       TrimSpace.trim(dept);
        if (dept!=null){
            //更新
            if(dept.getDeptid()!=null){
                deptMapper.updateDept(dept);
            //保存
            }else {
                deptMapper.addDept(dept);
            }
        }
        return new Result(200,"成功了");
    }

    @Override
    public Dept getDeptById(Integer id) {
        Dept dept = deptMapper.getDeptById(id);
        return dept;
    }

    @Override
    public List<Dept> searchByEntity(Dept dept) {
        TrimSpace.trim(dept);
        List<Dept> depts = deptMapper.searchByEntity(dept);
        return depts;
    }

    @Override
    public List<Dept> getList() {
        List<Dept> list = deptMapper.getList();
        return list;
    }
    @Override
    public TableResult<Dept> getSearchPage(int offset, int limit, Dept dept) {
        TrimSpace.trim(dept);
        try {
            PageHelper.startPage(offset / limit + 1, limit);
            List<Dept> deptList=new ArrayList<Dept>();
            if(dept==null){
                deptList = deptMapper.getList();
            }else{
                deptList = deptMapper.searchByEntity(dept);
            }
            PageInfo pageInfo = new PageInfo(deptList);
            TableResult<Dept> result = new TableResult<Dept>();
            result.setRows(deptList);
            result.setTotal((int) pageInfo.getTotal());
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
