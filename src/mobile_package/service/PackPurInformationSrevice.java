package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-17 17:35
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import mobile_package.entity.Customer;
import mobile_package.entity.PackPurInformation;
import mobile_package.exception.MyException;
import mobile_package.exception.ZyhtException;

import java.util.List;

/**
 * @author wangzhenxin
 * @InterfaceName PackPurInformationSrevice
 * @Description 购买信息Srevice
 * @date 2017-08-17
 */
public interface PackPurInformationSrevice extends BaseService<PackPurInformation,Long>{
    /**
     * @Title:savePackPurInforByPackPurInfList
     * @Description: 批量添加购买记录
     * @author wangzhenxin
     * @date 2017-08-18
     * @param packPurInformationList 购买信息集合
     * @return List<PackPurInformation>
     */
    public List<PackPurInformation> savePackPurInforByPackPurInfList(List<PackPurInformation> packPurInformationList)throws MyException,ZyhtException;

    /**
     * @Title:addPackPurInformationById
     * @Description: 根据id添加
     * @author wangzhenxin
     * @date 2017-08-18
     * @param id 主键ID
     * @return Long
     */
    public Long addPackPurInformationById(Long id)throws MyException,ZyhtException;

    /**
     * @Title:deletePackPurInformationByIdAndCustomer
     * @Description: 根据id和客户信息删除对应的购买记录
     * @author wangzhenxin
     * @date 2017-08-18
     * @param customer 客户信息对象
     * @param id 主键ID
     */
    public String deletePackPurInformationByIdAndCustomer(Long id, Customer customer)throws MyException,ZyhtException;

    /**
     * @Title:updatePackPurInformation
     * @Description: 修改购买记录信息
     * @author wangzhenxin
     * @date 2017-08-18
     * @param packPurInformation 购买信息对象
     */
    public void updatePackPurInformation(PackPurInformation packPurInformation)throws MyException,ZyhtException;

    /**
     * @Title:findPackPurInformationById
     * @Description: 根据id查询购买记录信息
     * @author wangzhenxin
     * @date 2017-08-18
     * @param id 主键ID
     * @return PackPurInformation
     */
    public PackPurInformation findPackPurInformationById(Long id)throws MyException,ZyhtException;

    /**
     * @Title:findPackPurInformationByIds
     * @Description: 根据指定id数组批量查找购买记录信息
     * @author wangzhenxin
     * @date 2017-08-18
     * @param ids 主键数组
     * @return List<PackPurInformation>
     */
    public List<PackPurInformation> findPackPurInformationByIds(Long[] ids)throws MyException,ZyhtException;//List<Long>

    /**
     * @Title:findPackPurInformationByAll
     * @Description: 查询所有的购买记录信息
     * @author wangzhenxin
     * @date 2017-08-18
     * @return List<PackPurInformation>
     */
    public List<PackPurInformation> findPackPurInformationByAll()throws MyException,ZyhtException;

    /**
     * @Title:queryPackPurInformationByAll
     * @Description: 查询所有的购买记录信息
     * @author wangzhenxin
     * @date 2017-08-18
     * @return List<PackPurInformation>
     */
    public List<PackPurInformation> queryPackPurInformationByAll()throws MyException,ZyhtException;


}
