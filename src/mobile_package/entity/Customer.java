package mobile_package.entity;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_15
 * @author wangzhenxin
 * @date 2017-08-15 18:05
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author wangzhenxin
 * @ClassName Customer
 * @Description 用户信息实体类
 * @date 2017-08-15
 */
public class Customer extends IdEntity<Long>{
    /**
     * name 客户姓名
     */
    private String name; //NAME
    /*
    * phoneCode 电话号码
    */
    private String phoneCode; //PHONE_CODE
    /*
    * sex 性别
    */
    private byte sex = 0; //SEX
    /**
     * idCard 身份证号码
     */
    private String idCard; //ID_CARD
    /**
     * address 家庭住址
     */
    private String address; //ADDRESS
    /**
     * balance 余额
     */
    private Double balance = 0d; //BALANCE
    /**
     * packageInfomation 套餐信息id
     */
    private PackageInformation packageInformation; //PACKAGE_INFOMATION_ID
    /*
    * isShutdown 是否停机 true-是,false-否
    */
    private Boolean isShutdown = false; //IS_SHUTDOWN
    /**
     * isStopArrears 是否欠费 true-是,false-否
     */
    private Boolean isStopArrears = false; //IS_STOP_ARREARS
    /**
     * starStates 客户星级 1-1星级,2-2星级,3-3星级,4-4星级,5-5星级
     */
    private byte starStates = 1; //STAR_STATES
    /**
     * callRecordsList 通话记录集合
     */
    private List<CallRecords> callRecordsList = new ArrayList<CallRecords>();
    private Set<CallRecords> callRecordsSet = new HashSet<CallRecords>();
    /**
     * messagesList 短信记录集合
     */
    private List<Messages> messagesList = new ArrayList<Messages>();
    private Set<Messages> messagesSet = new HashSet<Messages>();
    /**
     * packPurInformationList 套餐购买记录集合
     */
    private List<PackPurInformation> packPurInformationList = new ArrayList<PackPurInformation>();
    private Set<PackPurInformation> packPurInformationSet = new HashSet<PackPurInformation>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public PackageInformation getPackageInformation() {
        return packageInformation;
    }

    public void setPackageInformation(PackageInformation packageInformation) {
        this.packageInformation = packageInformation;
    }

    public Boolean getIsShutdown() {
        return isShutdown;
    }

    public void setIsShutdown(Boolean isShutdown) {
        this.isShutdown = isShutdown;
    }

    public Boolean getIsStopArrears() {
        return isStopArrears;
    }

    public void setIsStopArrears(Boolean isStopArrears) {
        this.isStopArrears = isStopArrears;
    }

    public byte getStarStates() {
        return starStates;
    }

    public void setStarStates(byte starStates) {
        this.starStates = starStates;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneCode='" + phoneCode + '\'' +
                ", sex=" + sex +
                ", idCard='" + idCard + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                ", packageInformation=" + packageInformation +
                ", isShutdown=" + isShutdown +
                ", isStopArrears=" + isStopArrears +
                ", starStates=" + starStates +
                '}';
    }
}
