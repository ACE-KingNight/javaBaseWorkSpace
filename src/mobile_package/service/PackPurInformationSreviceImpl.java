package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-17 17:38
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import mobile_package.entity.Customer;
import mobile_package.entity.PackPurInformation;

import java.util.List;

/**
 * @author wangzhenxin
 * @ClassName PackPurInformationSreviceImpl
 * @Description 购买信息Srevice实现
 * @date 2017-08-17
 */
public class PackPurInformationSreviceImpl extends BaseServiceImpl<PackPurInformation,Long> implements PackPurInformationSrevice {
    /**
     * @Title:savePackPurInforByPackPurInfList
     * @Description: 批量添加购买记录
     * @author wangzhenxin
     * @date 2017-08-18
     * @param packPurInformationList 购买信息集合
     * @return List<PackPurInformation>
     */
    @Override
    public List<PackPurInformation> savePackPurInforByPackPurInfList(List<PackPurInformation> packPurInformationList) {
        return null;
    }
    /**
     * @Title:addPackPurInformationById
     * @Description: 根据id添加
     * @author wangzhenxin
     * @date 2017-08-18
     * @param id 主键ID
     * @return Long
     */
    @Override
    public Long addPackPurInformationById(Long id) {
        return null;
    }
    /**
     * @Title:deletePackPurInformationByIdAndCustomer
     * @Description: 根据id和客户信息删除对应的购买记录
     * @author wangzhenxin
     * @date 2017-08-18
     * @param customer 客户信息对象
     * @param id 主键ID
     */
    @Override
    public String deletePackPurInformationByIdAndCustomer(Long id, Customer customer) {
        return null;
    }
    /**
     * @Title:updatePackPurInformation
     * @Description: 修改购买记录信息
     * @author wangzhenxin
     * @date 2017-08-18
     * @param packPurInformation 购买信息对象
     */
    @Override
    public void updatePackPurInformation(PackPurInformation packPurInformation) {

    }
    /**
     * @Title:findPackPurInformationById
     * @Description: 根据id查询购买记录信息
     * @author wangzhenxin
     * @date 2017-08-18
     * @param id 主键ID
     * @return PackPurInformation
     */
    @Override
    public PackPurInformation findPackPurInformationById(Long id) {
        return null;
    }
    /**
     * @Title:findPackPurInformationByIds
     * @Description: 根据指定id数组批量查找购买记录信息
     * @author wangzhenxin
     * @date 2017-08-18
     * @param ids 主键数组
     * @return List<PackPurInformation>
     */
    @Override
    public List<PackPurInformation> findPackPurInformationByIds(Long[] ids) {
        return null;
    }
    /**
     * @Title:findPackPurInformationByAll
     * @Description: 查询所有的购买记录信息
     * @author wangzhenxin
     * @date 2017-08-18
     * @return List<PackPurInformation>
     */
    @Override
    public List<PackPurInformation> findPackPurInformationByAll() {
        return null;
    }
    /**
     * @Title:queryPackPurInformationByAll
     * @Description: 查询所有的购买记录信息
     * @author wangzhenxin
     * @date 2017-08-18
     * @return List<PackPurInformation>
     */
    @Override
    public List<PackPurInformation> queryPackPurInformationByAll() {
        return null;
    }
}
