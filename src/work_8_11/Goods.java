package work_8_11;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_11
 * @author wangzhenxin
 * @date 2017-08-11 21:05
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.util.Date;

/**
 * @author wangzhenxin
 * @ClassName Goods
 * @Description 快递物品类
 * @date 2017-08-11
 */
public class Goods extends Date {
    /**
     *name 商品名称
     */
    private String name;
    /**
     * address 送货地址
     */
    private String address;
    /**
     * consignee 收货人
     * */
    private String consignee;
    /**
     * consignee_phone 收货人电话
     */
    private String consignee_phone;
    /**
     * delivery_time 送货时间
     */
    private Date delivery_time;
    /**
     * money 价钱
     */
    private Double money=0d;
    /**
     * is_receiver 是否收件 ture-是 false-否
     */
    private  Boolean is_receiver=false;
    /**
     * receiver_time 收件时间
     * */
    private Date receiver_time;

    public Date getReceiver_time() {
        return receiver_time;
    }

    public void setReceiver_time(Date receiver_time) {
        this.receiver_time = receiver_time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getConsignee_phone() {
        return consignee_phone;
    }

    public void setConsignee_phone(String consignee_phone) {
        this.consignee_phone = consignee_phone;
    }

    public Date getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(Date delivery_time) {
        this.delivery_time = delivery_time;
    }

    public Boolean getIs_receiver() {
        return is_receiver;
    }

    public void setIs_receiver(Boolean is_receiver) {
        this.is_receiver = is_receiver;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Goods(String name, String address, String consignee, String consignee_phone, Date delivery_time, Double money, Boolean is_receiver, Date receiver_time) {
        this.name = name;
        this.address = address;
        this.consignee = consignee;
        this.consignee_phone = consignee_phone;
        this.delivery_time = delivery_time;
        this.money = money;
        this.is_receiver = is_receiver;
        this.receiver_time = receiver_time;
    }

    public Goods() {
    }


}
