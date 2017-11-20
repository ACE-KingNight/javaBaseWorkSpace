package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-18 15:45
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import mobile_package.entity.PackPurInformation;
import mobile_package.entity.PackageInformation;
import mobile_package.exception.MyException;
import mobile_package.exception.ZyhtException;

/**
 * @author wangzhenxin
 * @InterfaceName PackageInformationService
 * @Description 套餐信息service
 * @date 2017-08-18
 */
public interface PackageInformationService extends BaseService<PackPurInformation,Long> {
    /**
     * @Title:
     * @Description: 添加套餐信息返回对应套餐信息（套餐信息的id）
     * @author wangzhenxin
     * @date 2017-08-18
     * @param packageInformation 套餐信息
     * @return packageInformation
     */
    public PackageInformation savePackageInformation(PackageInformation packageInformation)throws MyException,ZyhtException;
}
