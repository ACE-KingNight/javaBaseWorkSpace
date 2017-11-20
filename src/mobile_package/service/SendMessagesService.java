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
import mobile_package.exception.MyException;
import mobile_package.exception.ZyhtException;

import java.util.List;

/**
 * @author wangzhenxin
 * @InterfaceName SendMessagesService
 * @Description 发送短信service
 * @date 2017-08-20
 */
public interface SendMessagesService {
    /**
     * @Title: sendMessages
     * @Description: 用户批量发送短信
     * @author wangzhenxin
     * @date 2017-08-20
     * @param sendCustomer 发送客户信息
     * @param messageContent 短信内容
     * @param phoneCodeList 接受客户电话号码集合
     */
    public void sendMessages(Customer sendCustomer,List<String> phoneCodeList,String messageContent)throws MyException,ZyhtException;
}
