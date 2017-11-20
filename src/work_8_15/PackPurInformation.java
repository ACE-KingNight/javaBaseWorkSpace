package work_8_15;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_15
 * @author wangzhenxin
 * @date 2017-08-15 18:18
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.util.Date;

/**
 * @author wangzhenxin
 * @ClassName PackPurInformation
 * @Description 套餐购买信息实体类
 * @date 2017-08-15
 */
public class PackPurInformation {
    /**
     * purchasingDate 购买日期 yyyy-MM-dd
     */
    private Date purchasingDate;//PURCHASING_DATE
    /**
     * purchaser 购买人
     */
    private String purchaser;//PURCHASER
    /**
     *packageInformation 套餐信息
     */
    private String packageInformation;//PACKAGE_INFORMATION
    /**
     *paymentAmount 支付金额
     */
    private Double paymentAmount;//PAYMENT_AMOUNT
    /**
     *isPaySucceed 是否支付成功 true-是,false-否
     */
    private Boolean isPaySucceed = false;//IS_PAY_SUCCEED
    /**
     *executionDate 套餐执行时间
     */
    private Date executionDate;//EXECUTION_DATE

    public Date getPurchasingDate() {
        return purchasingDate;
    }

    public void setPurchasingDate(Date purchasingDate) {
        this.purchasingDate = purchasingDate;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public String getPackageInformation() {
        return packageInformation;
    }

    public void setPackageInformation(String packageInformation) {
        this.packageInformation = packageInformation;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Boolean getIsPaySucceed() {
        return isPaySucceed;
    }

    public void setIsPaySucceed(Boolean isPaySucceed) {
        this.isPaySucceed = isPaySucceed;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }
}
