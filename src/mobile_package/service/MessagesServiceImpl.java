package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-20 12:15
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import mobile_package.entity.Messages;

import java.util.List;

/**
 * @author wangzhenxin
 * @ClassName MessagesServiceImpl
 * @Description 短信service实现
 * @date 2017-08-20
 */
public class MessagesServiceImpl extends BaseServiceImpl<Messages,Long> implements MessagesService{
    /**
     * @Title:updateMessagesByMessagesList
     * @Description: 根据短信记录集合更新对应的短信记录
     * @author wangzhenxin
     * @date 2017-08-18
     * @param messagesList 短信记录集合
     * @return String
     */
    @Override
    public String updateMessagesByMessagesList(List<Messages> messagesList) {
        return null;
    }
}
