package work_8_22;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_22
 * @author wangzhenxin
 * @date 2017-08-22 11:17
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Administrative
 * @Description 行政类
 * @date 2017-08-22
 */
public class Administrative extends Staff{

    @Override
    public Double salaryCalculator() {
        super.salary = Staff.BASE_PAY + Staff.POST_WAGE;
        return super.salary;
    }
}
