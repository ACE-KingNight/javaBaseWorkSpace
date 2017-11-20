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

import java.util.List;

/**
 * @author wangzhenxin
 * @ClassName CustomerServiceImpl
 * @Description 客户信息Service实现
 * @date 2017-08-18
 */
public class CustomerServiceImpl extends BaseServiceImpl<Customer,Long> implements CustomerService {
    /**
     * @Title:updateCustomerByCustomerList
     * @Description: 根据客户信息集合更新对应的客户信息
     * @author wangzhenxin
     * @date 2017-08-18
     */
    @Override
    public String updateCustomerByCustomerList(List<Customer> customerList) {
        if (customerList!=null && customerList.size()>0){
            for (int i = 0; i <customerList.size() ; i++) {
                System.out.println("客户的名称:"+customerList.get(i).getName()+" 客户余额:"+customerList.get(i).getBalance());
            }
            return "更新数据成功!";
        }
        return  "更新失败!";
    }
    /**
     * @Title:updateCustomerByCustomerList
     * @Description: 根据客户电话号码查询对应的客户
     * @author wangzhenxin
     * @date 2017-08-18
     * @param phoneCode 客户电话号码
     * @return String
     */
    @Override
    public Customer findCustomerByPhoneCode(String phoneCode) {
        return null;
    }
    /**
     * @Title:updateCustomerByCustomerList
     * @Description: 根据客户信息更新对应的客户信息
     * @author wangzhenxin
     * @date 2017-08-18
     * @param customer 客户信息
     * @return String
     */
    @Override
    public String updateCustomerByCustomer(Customer customer) {
        if (customer == null){
            throw new MyException("对象为空");
        }
        return "更新成功";
    }
//        if (customer!=null){
//            System.out.println("客户的名称:"+customer.getName()+" 客户余额:"+customer.getBalance());
//            return "更新数据成功!";
//        }
//        return  "更新失败!";
//    }
}
