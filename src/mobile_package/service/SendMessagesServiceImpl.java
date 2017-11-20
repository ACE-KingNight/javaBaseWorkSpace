package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-20 10:53
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import mobile_package.entity.Customer;
import mobile_package.entity.Messages;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wangzhenxin
 * @ClassName SendMessagesServiceImpl
 * @Description 发送短信service实现
 * @date 2017-08-20
 */
public class SendMessagesServiceImpl implements SendMessagesService {
    /**
     * @Title: sendMessages
     * @Description: 用户批量发送短信
     * @author wangzhenxin
     * @date 2017-08-20
     * @param sendCustomer 发送客户信息
     * @param messageContent 短信内容
     * @param phoneCodeList 接受客户电话号码集合
     */
    @Override
    public void sendMessages(Customer sendCustomer, List<String> phoneCodeList,String messageContent) {
        //判断接受客户电话号码集合不为空
        if (phoneCodeList!=null && phoneCodeList.size()>0){
            //定义发送短信集合
            List<Messages> messagesList = new ArrayList<Messages>();
            //定义短信条数
            int messagesNumber = 1;
            //定义用户消费金额
            double consumption = 0d;
            //根据发送客户电话号码集合循环
            for (int i = 0; i < phoneCodeList.size(); i++) {
                //定义发送短信对象
                Messages messages = new Messages();
                //设置发送短信客户信息
                messages.setSendCustomer(sendCustomer);
                //设置发送短信时间
                messages.setSendMessagesTime(new Date());
                //设置接收短信时间
                messages.setReceiveMessagesTime(new Date());
                //设置短信类型为短信
                messages.setMessagesType(Messages.MESSAGES);
                //设置短信发送成功
                messages.setIsReceive(true);
                //设置短信内容
                messages.setMessageContent(messageContent);
                //定义接收短信客户
                Customer receiveCustomer = new Customer();
                //定义客户信息service
                CustomerService customerService = new CustomerServiceImpl();
                //根据电话号码查找接收短信客户信息
                receiveCustomer = customerService.findCustomerByPhoneCode(phoneCodeList.get(i));
                //判断是否存在接收对象
                if (receiveCustomer == null || sendCustomer.getBalance().doubleValue() < consumption) {
                    //设置短信未发送成功
                    messages.setIsReceive(false);
                } else {
                    //设置接受客户信息
                    messages.setReceiveCustomer(receiveCustomer);
                    /**
                     * 判断客户发送的信息内容字数，
                     * 如果字数大于70字则发送短信的数量乘以2。
                     */
                    if (messageContent !=null && messageContent != "" && messageContent.length()>0){
                        if (messageContent.length()>70){
                            messagesNumber = messageContent.length()/70+1;
                        }
                    }else {
                        System.out.println("短信内容为空是否发送？");
                    }
                    //设置客户消费金额
                    messages.setConsumption(Messages.MESSAGES_TARIFF * messagesNumber);
                    //累加客户消费金额
                    consumption = consumption+messages.getConsumption().doubleValue();
                    //将记录添加至短信信息集合
                    messagesList.add(messages);
                }
            }
            //扣除用户费用
            sendCustomer.setBalance(sendCustomer.getBalance()-consumption);
            //定义客户信息service
            CustomerService customerService = new CustomerServiceImpl();
            //更新发送客户信息
            customerService.updateCustomerByCustomer(sendCustomer);
            //定义短信发送service
            MessagesService messagesService = new MessagesServiceImpl();
            //根据短信发送集合更新数据库
            messagesService.updateMessagesByMessagesList(messagesList);
        }
    }
}
