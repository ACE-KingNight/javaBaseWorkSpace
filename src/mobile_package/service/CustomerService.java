package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-18 16:15
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import mobile_package.entity.Customer;
import mobile_package.exception.MyException;
import mobile_package.exception.ZyhtException;

import java.util.List;

/**
 * @author wangzhenxin
 * @InterfaceName CustomerService
 * @Description 客户信息Service
 * @date 2017-08-18
 */
public interface CustomerService extends BaseService<Customer,Long>{
    /**
     * @Title:updateCustomerByCustomerList
     * @Description: 根据客户信息集合更新对应的客户信息
     * @author wangzhenxin
     * @date 2017-08-18
     * @param customerList 客户集合
     * @return String
     */
    public String updateCustomerByCustomerList(List<Customer> customerList)throws MyException,ZyhtException;

    /**
     * @Title:updateCustomerByCustomerList
     * @Description: 根据客户电话号码查询对应的客户
     * @author wangzhenxin
     * @date 2017-08-18
     * @param phoneCode 客户电话号码
     * @return String
     */
    public Customer findCustomerByPhoneCode(String phoneCode)throws MyException,ZyhtException;
    /**
     * @Title:updateCustomerByCustomerList
     * @Description: 根据客户信息更新对应的客户信息
     * @author wangzhenxin
     * @date 2017-08-18
     * @param customer 客户信息
     * @return String
     */
    public String updateCustomerByCustomer(Customer customer)throws MyException,ZyhtException;
}
