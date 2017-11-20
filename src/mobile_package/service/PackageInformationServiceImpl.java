package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-18 15:56
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import mobile_package.entity.PackPurInformation;
import mobile_package.entity.PackageInformation;

/**
 * @author wangzhenxin
 * @ClassName PackageInformationServiceImpl
 * @Description 套餐信息service实现
 * @date 2017-08-18
 */
public class PackageInformationServiceImpl extends BaseServiceImpl<PackPurInformation,Long> implements PackageInformationService {
    /**
     * @Title:
     * @Description: 添加套餐信息返回对应套餐信息（套餐信息的id）
     * @author wangzhenxin
     * @date 2017-08-18
     * @param packageInformation 套餐信息
     * @return packageInformation
     */
    @Override
    public PackageInformation savePackageInformation(PackageInformation packageInformation) {
        return null;
    }
}
