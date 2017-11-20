package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-20 12:13
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */


import mobile_package.entity.Messages;
import mobile_package.exception.MyException;
import mobile_package.exception.ZyhtException;

import java.util.List;

/**
 * @author wangzhenxin
 * @InterfaceName MessagesService
 * @Description 短信service
 * @date 2017-08-20
 */
public interface MessagesService extends BaseService<Messages,Long>{
    /**
     * @Title:updateMessagesByMessagesList
     * @Description: 根据短信记录集合更新对应的短信记录
     * @author wangzhenxin
     * @date 2017-08-18
     * @param messagesList 短信记录集合
     * @return String
     */
    public String updateMessagesByMessagesList(List<Messages> messagesList)throws MyException,ZyhtException;
}
