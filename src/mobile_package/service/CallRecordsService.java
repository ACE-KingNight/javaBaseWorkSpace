package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-20 12:25
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import mobile_package.entity.CallRecords;
import mobile_package.exception.MyException;
import mobile_package.exception.ZyhtException;

/**
 * @author wangzhenxin
 * @InterfaceName CallRecordsService
 * @Description 通话记录service
 * @date 2017-08-20
 */
public interface CallRecordsService extends BaseService<CallRecords,Long>{
    /**
     * @Title:updateCallRecordsByCallRecords
     * @Description: 根据通话记录信息更新对应的通话记录
     * @author wangzhenxin
     * @date 2017-08-18
     * @param callRecords 通话记录信息
     * @return String
     */
    public String updateCallRecordsByCallRecords(CallRecords callRecords) throws ZyhtException,MyException;
}
