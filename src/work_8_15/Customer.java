package work_8_15;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_15
 * @author wangzhenxin
 * @date 2017-08-15 18:05
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Customer
 * @Description 用户信息实体类
 * @date 2017-08-15
 */
public class Customer {
    /**
     * name 客户姓名
     */
    private String name; //NAME
    /*
    * phoneNumber 电话号码
    */
    private String phoneNumber; //PHONE_NUMBER
    /*
    * sex 性别
    */
    private byte sex = 0; //SEX
    /**
     * idNumber 身份证号码
     */
    private String idNumber; //ID_NUMBER
    /**
     * address 家庭住址
     */
    private String address; //ADDRESS
    /**
     * balance 余额
     */
    private Double balance = 0d; //BALANCE
    /**
     * beginUsedPackage 正在使用的套餐
     */
    private String beginUsedPackage; //BEGIN_USED_PACKAGE
    /*
    * isStop 是否停机 true-是,false-否
    */
    private Boolean isStop = false; //IS_STOP
    /**
     * isArrearage 是否欠费 true-是,false-否
     */
    private Boolean isArrearage = false; //IS_ARREARAGE
    /**
     * customerStar 客户星级 1-1星级,2-2星级,3-3星级,4-4星级,5-5星级
     */
    private byte customerStar = 1; //CUSTOMER_STAR

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getBeginUsedPackage() {
        return beginUsedPackage;
    }

    public void setBeginUsedPackage(String beginUsedPackage) {
        this.beginUsedPackage = beginUsedPackage;
    }

    public Boolean getIsStop() {
        return isStop;
    }

    public void setIsStop(Boolean isStop) {
        this.isStop = isStop;
    }

    public Boolean getIsArrearage() {
        return isArrearage;
    }

    public void setIsArrearage(Boolean isArrearage) {
        this.isArrearage = isArrearage;
    }

    public byte getCustomerStar() {
        return customerStar;
    }

    public void setCustomerStar(byte customerStar) {
        this.customerStar = customerStar;
    }
}
