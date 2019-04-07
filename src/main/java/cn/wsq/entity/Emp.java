package cn.wsq.entity;
import java.io.Serializable;

/**
*员工信息
*/
public class Emp implements Serializable {
    private String empid;//员工id

    private String empName;//姓名

    private String empLoginName;//登录名

    private String empPwd;//密码

    private Double empSalary;//工资

    private Integer deptId;//部门id

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpLoginName() {
        return empLoginName;
    }

    public void setEmpLoginName(String empLoginName) {
        this.empLoginName = empLoginName;
    }
    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }
    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }
    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}