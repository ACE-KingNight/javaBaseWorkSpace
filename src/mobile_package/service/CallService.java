package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-17 18:16
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */


import mobile_package.entity.Customer;
import mobile_package.exception.MyException;
import mobile_package.exception.ZyhtException;

/**
 * @author wangzhenxin
 * @InterfaceName CallService
 * @Description 拨打电话方法接口
 * @date 2017-08-17
 */
public interface CallService {
    /**
     * @Title: call
     * @Description: 打电话方法
     * @author wangzhenxin
     * @date 2017-08-17
     * @param callCustomer 打电话者
     * @param phoneCode 电话号码
     */

    public void call(Customer callCustomer,String phoneCode) throws MyException,ZyhtException;
//    public Integer answer(CallRecords callRecords,Customer callCustomer,Customer answerCustomer,String phoneCode);
}
