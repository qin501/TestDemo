package cn.wsq.entity;
import java.io.Serializable;

/**
*部门管理
*/
public class Dept implements Serializable {
    private Integer deptid;//部门id

    private String deptName;//部门名称

    private String deptLoc;//部门地址

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public String getDeptLoc() {
        return deptLoc;
    }

    public void setDeptLoc(String deptLoc) {
        this.deptLoc = deptLoc;
    }
}