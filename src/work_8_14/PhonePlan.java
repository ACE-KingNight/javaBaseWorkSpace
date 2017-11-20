package work_8_14;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_14
 * @author wangzhenxin
 * @date 2017-08-14 20:47
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName PackageInformation
 * @Description 电话套餐实体类
 * @date 2017-08-14
 */
public class PhonePlan {
    /**
     * 套餐编号
     * */
     private Integer id = 0; //ID
    /**
     *name 套餐名称
     */
    private String name; //NAME
    /**
     * describe 套餐描述
     */
    private String describe; //DESCRIBE
    /**
     * SMS 短信条数
     * */
    private Integer SMS; //SMS
    /**
     * callDuration 通话时长
     */
    private Integer callDuration; //CALL_DURATION
    /**
     * mobileTraffic 手机流量
     */
    private Integer mobileTraffic; //MOBILE_TRAFFIC
    /**
     * unit 流量单位
     */
    private String unit;//UNIT
    /**
     * isCallReminder 是否有来电提醒 TRUE-是，FALSE-否'
     */
    private Boolean isCallReminder; //IS_CALL_REMINDER
    /**
     * IS_RBT 是否有彩铃 TRUE-是，FALSE-否'
     */
    private Boolean isRbt; //IS_RBT
    /**
     * monthlyRent 月租
     */
    private Double monthlyRent; //MONTHLY_RENT

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getSMS() {
        return SMS;
    }

    public void setSMS(Integer SMS) {
        this.SMS = SMS;
    }

    public Integer getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(Integer callDuration) {
        this.callDuration = callDuration;
    }

    public Integer getMobileTraffic() {
        return mobileTraffic;
    }

    public void setMobileTraffic(Integer mobileTraffic) {
        this.mobileTraffic = mobileTraffic;
    }

    public Boolean getIsCallReminder() {
        return isCallReminder;
    }

    public void setIsCallReminder(Boolean isCallReminder) {
        this.isCallReminder = isCallReminder;
    }

    public Boolean getIsRbt() {
        return isRbt;
    }

    public void setIsRbt(Boolean isRbt) {
        this.isRbt = isRbt;
    }

    public Double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(Double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }
}
