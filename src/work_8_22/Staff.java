package work_8_22;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_22
 * @author wangzhenxin
 * @date 2017-08-22 11:10
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Staff
 * @Description 员工类
 * @date 2017-08-22
 */
public abstract class Staff {
    public static final Double BASE_PAY = 4000d;
    public static final Double POST_WAGE = 2000d;
    /**
     * 姓名
     */
    protected String name;
    /**
     * 性别 1-男 2-女
     */
    protected Byte sex;
    /**
     * department 工作部门 1-行政 2-技术 3-销售
     */
    protected Byte department;
    /**
     * salary 工资
     */
    protected Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Byte getDepartment() {
        return department;
    }

    public void setDepartment(Byte department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * @Title: salaryCalculator
     * @Description: 计算工资方法
     * @author wangzhenxin
     * @date 2017-08-22
     */
    public abstract Double salaryCalculator();
}
