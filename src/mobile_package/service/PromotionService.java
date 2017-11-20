package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-18 14:21
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import mobile_package.entity.Customer;
import mobile_package.entity.PackageInformation;
import mobile_package.exception.MyException;
import mobile_package.exception.ZyhtException;

import java.util.List;
import java.util.Map;

/**
 * @author wangzhenxin
 * @InterfaceName PromotionService
 * @Description 套餐购买促销方案接口
 * @date 2017-08-18
 */
public interface PromotionService {
    /**
     * @Title: salePackage
     * @Description: 彩铃和月租套餐
     * @author wangzhenxin
     * @Date 2017/08/17
     * @param isColorBack 是否彩铃
     * @param monthlyRent  月租
     * @param customerList 客户信息集合
     * @param packageInformation 套餐信息
     * @return PackageInformation
     */
    public PackageInformation salePackage(Boolean isColorBack, Double monthlyRent,PackageInformation packageInformation,List<Customer> customerList)throws MyException,ZyhtException;

    /**
     * @Title: salePackage
     * @Description: 彩铃和月租套餐
     * @author wangzhenxin
     * @date 2017-08-24
     * @param stringObjectMap 套餐销售信息集合
     */
    public PackageInformation salePackage(Map<String,Object> stringObjectMap);

    /**
     * @Title: salePackage
     * @Description: 分钟和流量套餐
     * @author wangzhenxin
     * @Date 2017/08/17
     * @param monthlyRent  月租
     * @param flowNumber    流量
     * @param packageInformation 套餐信息
     * @param customerList 客户信息集合
     * @return PackageInformation
     */
    public PackageInformation salePackage(Double monthlyRent, Integer flowNumber,PackageInformation packageInformation,List<Customer> customerList)throws MyException,ZyhtException;

    /**
     * @Title: salePackage
     * @Description: 短息和分钟数套餐
     * @author wangzhenxin
     * @Date 2017/08/17
     * @param messageNumber  短息数量
     * @param minuteNumber   分钟数
     * @param customerList 客户信息集合
     * @param packageInformation  套餐信息
     * @return PackageInformation
     */
    public PackageInformation salePackage(Integer messageNumber, Integer minuteNumber,PackageInformation packageInformation,List<Customer> customerList)throws MyException,ZyhtException;
}
