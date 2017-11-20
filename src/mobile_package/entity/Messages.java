package mobile_package.entity;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package
 * @author wangzhenxin
 * @date 2017-08-20 10:42
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.util.Date;

/**
 * @author wangzhenxin
 * @ClassName Messages
 * @Description 短信实体类
 * @date 2017-08-20
 */
public class Messages extends IdEntity<Long>{
    //定义短信资费常量
    public static final Double MESSAGES_TARIFF = 0.1d;
    //定义彩信资费常量
    public static final Double MULTIMEDIA_MESSAGE_TARIFF = 0.5d;
    //定义短信类型 MESSAGES-短信,MULTIMEDIA_MESSAGES-彩信
    public static final Byte MESSAGES = 1;
    public static final Byte MULTIMEDIA_MESSAGES = 2;
    /**
     * sendCustomerId 发送客户信息
     */
    private Customer sendCustomer;//SEND_CUSTOMER_ID
    /**
     *receiveCustomerId 接受客户信息
     */
    private Customer receiveCustomer;//RECEIVE_CUSTOMER_ID
    /**
     * consumption 本次消费
     */
    private Double consumption;//CONSUMPTION
    /**
     * sendMessagesTime 发送短信时间 yyyy-MM-dd HH:mm:ss
     */
    private Date sendMessagesTime;//SEND_MESSAGES_TIME
    /**
     * receiveMessagesTime 接收短信时间 yyyy-MM-dd HH:mm:ss
     */
    private Date receiveMessagesTime;//RECEIVE_MESSAGES_TIME
    /**
     * messagesType 短信类型 1-短信，2-彩信
     */
    private Byte messagesType;//MESSAGES_TYPE
    /**
     * isReceive 是否接受 true-是,false-否
     */
    private Boolean isReceive;//IS_RECEIVE
    /**
     * messageContent 短信内容
     */
    private String messageContent;//MESSAGE_CONTENT

    public Customer getSendCustomer() {
        return sendCustomer;
    }

    public void setSendCustomer(Customer sendCustomer) {
        this.sendCustomer = sendCustomer;
    }

    public Customer getReceiveCustomer() {
        return receiveCustomer;
    }

    public void setReceiveCustomer(Customer receiveCustomer) {
        this.receiveCustomer = receiveCustomer;
    }

    public Double getConsumption() {
        return consumption;
    }

    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    public Date getSendMessagesTime() {
        return sendMessagesTime;
    }

    public void setSendMessagesTime(Date sendMessagesTime) {
        this.sendMessagesTime = sendMessagesTime;
    }

    public Date getReceiveMessagesTime() {
        return receiveMessagesTime;
    }

    public void setReceiveMessagesTime(Date receiveMessagesTime) {
        this.receiveMessagesTime = receiveMessagesTime;
    }

    public Byte getMessagesType() {
        return messagesType;
    }

    public void setMessagesType(Byte messagesType) {
        this.messagesType = messagesType;
    }

    public Boolean getIsReceive() {
        return isReceive;
    }

    public void setIsReceive(Boolean isReceive) {
        this.isReceive = isReceive;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
}
