package test; /********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package PACKAGE_NAME
 * @author wangzhenxin
 * @date 2017-08-08 17:49
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */


import java.util.Date;

/**
 * @author wangzhenxin
 * @ClassName test.People
 * @Description 人员类
 * @date 2017-08-08
 * @实体类要用引用类型
 */
public class People {

    /**
    *nameStr 姓名
    */
    private String nameStr;
    /**
     * sex 性别
     */
    private String sex="m";
    /**
    * */
    private Integer ageInt=0;

    /**
     * birthday 出生日期
     */
    private Date birthday;
    /**
     * balanceDouble 银行卡余额
     */
    private Double balanceDouble=0d;

    public Integer getAgeInt() {
        return ageInt;
    }

    public void setAgeInt(Integer ageInt) {
        this.ageInt = ageInt;
    }

    public Double getBalanceDouble() {
        return balanceDouble;
    }

    public void setBalanceDouble(Double balanceDouble) {
        this.balanceDouble = balanceDouble;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public People() {

    }

    public People(Integer ageInt, String sex, Date birthday, Double balanceDouble, String nameStr) {
        this.ageInt = ageInt;
        this.sex = sex;
        this.birthday = birthday;
        this.balanceDouble = balanceDouble;
        this.nameStr = nameStr;
    }

    public String getNameStr() {
        return nameStr;
    }

    public void setNameStr(String nameStr) {
        this.nameStr = nameStr;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
