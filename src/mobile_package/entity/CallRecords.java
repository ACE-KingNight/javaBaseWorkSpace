package mobile_package.entity;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package
 * @author wangzhenxin
 * @date 2017-08-17 18:03
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.util.Date;

/**
 * @author wangzhenxin
 * @ClassName CallRecords
 * @Description 通话记录实体类
 * @date 2017-08-17
 */
public class CallRecords extends IdEntity<Long>{
    //设置静态常量拨打类型 CALL-拨打者 ANSWER-接听者
    public static final Byte CALL = 1;
    public static final Byte ANSWER = 2;
    //设置静态常量通话类型 LOCAL_CONNECTION-本地通话 LONG_TOLL_CALL-长途电话 ROAMING_CALLS-漫游通话
    public static final Byte LOCAL_CONNECTION = 1;
    public static final Byte LONG_TOLL_CALL = 2;
    public static final Byte ROAMING_CALLS = 3;
    //设置不同通话类型资费
    //本地通话资费
    public static final Double LOCAL_CONNECTION_MONEY = 0.35d;
    //长途通话资费
    public static final Double LONG_TOLL_CALL_MONEY = 0.5d;
    //漫游通话资费
    public static final Double ROAMING_CALLS_MONEY = 0.99d;
    /**
     * callCustomerId 拨打客户信息Id
     */
    private Customer callCustomer;//CALL_CUSTOMER_ID
    /**
     * answerCustomerId 接听客户信息ID
     */
    private Customer answerCustomer;//ANSWER_CUSTOMER_ID
    /**
     * callDuration 通话时长
     */
    private Long callDuration;//CALL_DURATION
    /**
     * consumption 本次消费 yyyy-MM-dd HH:mm:ss
     */
    private Double consumption;//CONSUMPTION
    /**
     * startCallTime 本次通话开始时间 yyyy-MM-dd HH:mm:ss
     */
    private Date startCallTime;//START_CALL_TIME
    /**
     * endCallTime 本次通话结束时间
     */
    private Date endCallTime;//END_CALL_TIME
    /**
     * callType 通话类型 1-本地通话,2-长途通话,3-漫游通话
     */
    private Byte callType;//CALL_TYPE
    /**
     * isAnswer 是否接听 true-是,false-否
     */
    private Boolean isAnswer;//IS_ANSWER
    /**
     * dialType 拨打类型 1-拨打,2-接听
     */
    private Byte dialType;//DIAL_TYPE

    public Customer getCallCustomer() {
        return callCustomer;
    }

    public void setCallCustomer(Customer callCustomer) {
        this.callCustomer = callCustomer;
    }

    public Customer getAnswerCustomer() {
        return answerCustomer;
    }

    public void setAnswerCustomer(Customer answerCustomer) {
        this.answerCustomer = answerCustomer;
    }

    public Long getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(Long callDuration) {
        this.callDuration = callDuration;
    }

    public Double getConsumption() {
        return consumption;
    }

    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    public Date getStartCallTime() {
        return startCallTime;
    }

    public void setStartCallTime(Date startCallTime) {
        this.startCallTime = startCallTime;
    }

    public Date getEndCallTime() {
        return endCallTime;
    }

    public void setEndCallTime(Date endCallTime) {
        this.endCallTime = endCallTime;
    }

    public Byte getCallType() {
        return callType;
    }

    public void setCallType(Byte callType) {
        this.callType = callType;
    }

    public Boolean getIsAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(Boolean isAnswer) {
        this.isAnswer = isAnswer;
    }

    public Byte getDialType() {
        return dialType;
    }

    public void setDialType(Byte dialType) {
        this.dialType = dialType;
    }
}
