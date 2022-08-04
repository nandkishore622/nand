package com.cg;

public class Emp {
    Integer empId;
    String empName;
    Integer empAge;
    Double salary;
    String dept;
    String status;

    public Emp() {
    }

    public Emp(Integer empId, String empName, Integer empAge, Double salary, String dept, String status) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.salary = salary;
        this.dept = dept;
        this.status = status;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
