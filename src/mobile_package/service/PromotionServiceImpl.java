package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-18 14:22
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import mobile_package.entity.Customer;
import mobile_package.entity.PackPurInformation;
import mobile_package.entity.PackageInformation;

import java.util.*;

/**
 * @author wangzhenxin
 * @ClassName PromotionServiceImpl
 * @Description 套餐购买促销方案实现
 * @date 2017-08-18
 */
public class PromotionServiceImpl implements PromotionService {
    /**
     * @Title: sale
     * @Description: 根据套餐短信数和分钟数促销
     * @author wangzhenxin
     * @date 2017-08-15
     * @param messageNumber 短信条数
     * @param minuteNumber 通话时长
     */
    @Override
    public PackageInformation salePackage(Integer messageNumber, Integer minuteNumber,PackageInformation packageInformation,List<Customer> customerList) {
        //定义购买记录集合
        List<PackPurInformation> packPurInformationList = new ArrayList<PackPurInformation>();
        //是否有彩铃
        packageInformation.setMessageNumber(messageNumber);
        //月租
        packageInformation.setMinuteNumber(minuteNumber);
        //定义套餐星系服务
        PackageInformationService packageInformationService = new PackageInformationServiceImpl();
        //添加套餐信息
        packageInformationService.savePackageInformation(packageInformation);
        //定义购买记录服务
        PackPurInformationSrevice packPurInformationSrevice = new PackPurInformationSreviceImpl();
        //判断购买客户不为空
        if (customerList != null && customerList.size()>0) {
            for (int i = 0; i < customerList.size() ; i++) {
                Customer customer = customerList.get(i);
                //定义购买记录对象
                PackPurInformation packPurInformation = new PackPurInformation();
                //设置购买时间
                packPurInformation.setBuyTime(new Date());
                //价格
                packPurInformation.setAmountOfPayment(packageInformation.getMonthlyRent());
                //购买客户
                packPurInformation.setCustomer(customerList.get(i));
                //生效日期
                packPurInformation.setEffectTime(new Date());
                //判断用户的余额是否足够购买套餐
                if (customer.getBalance()!=null && packageInformation.getMonthlyRent()!=null &&
                        (customer.getBalance().doubleValue() >= packageInformation.getMonthlyRent().doubleValue())){
                    //是否成功 true-是，false-否
                    packPurInformation.setIsSuccess(true);
                }else{
                    packPurInformation.setIsSuccess(false);
                }
                //套餐信息对象
                packPurInformation.setPackageInformation(packageInformation);
                packPurInformationList.add(packPurInformation);
                /**
                 * 根据是否购买成功，决定是否扣除用户的余额，
                 * 如果不成功(false) 不扣除用户的余额，"输出您的余额已不足，请及时充值"，
                 * 否则扣除用户的余额
                 */
                if(packPurInformation.getIsSuccess()){
                    //扣除用户余额
                    customer.setBalance(customer.getBalance().doubleValue()-packPurInformation.getAmountOfPayment().doubleValue());
                    //更新套餐信息
                    customer.setPackageInformation(packageInformation);
                }else{
                    System.out.println("输出您的余额已不足，请及时充值!");
                }
            }
            //添加购买信息记录
            packPurInformationSrevice.savePackPurInforByPackPurInfList(packPurInformationList);
            //定义客户信息服务
            CustomerService customerService=new CustomerServiceImpl();
            //更新客户信息
            System.out.println(customerService.updateCustomerByCustomerList(customerList));

        }
        return packageInformation;
    }
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
    @Override
    public PackageInformation salePackage(Boolean isColorBack, Double monthlyRent,PackageInformation packageInformation,List<Customer> customerList){
        //定义购买记录集合
        List<PackPurInformation> packPurInformationList = new ArrayList<PackPurInformation>();
        //是否有彩铃
        packageInformation.setIsColorBack(isColorBack);
        //月租
        packageInformation.setMonthlyRent(monthlyRent);
        //定义套餐星系服务
        PackageInformationService packageInformationService = new PackageInformationServiceImpl();
        //添加套餐信息
        packageInformationService.savePackageInformation(packageInformation);
        //定义购买记录服务
        PackPurInformationSrevice packPurInformationSrevice = new PackPurInformationSreviceImpl();
        //判断购买客户不为空
        if (customerList != null && customerList.size()>0) {
            for (int i = 0; i < customerList.size() ; i++) {
                Customer customer = customerList.get(i);
                //定义购买记录对象
                PackPurInformation packPurInformation = new PackPurInformation();
                //设置购买时间
                packPurInformation.setBuyTime(new Date());
                //价格
                packPurInformation.setAmountOfPayment(packageInformation.getMonthlyRent());
                //购买客户
                packPurInformation.setCustomer(customerList.get(i));
                //生效日期
                packPurInformation.setEffectTime(new Date());
                //判断用户的余额是否足够购买套餐
                if (customer.getBalance()!=null && packageInformation.getMonthlyRent()!=null &&
                        (customer.getBalance().doubleValue() >= packageInformation.getMonthlyRent().doubleValue())){
                    //是否成功 true-是，false-否
                    packPurInformation.setIsSuccess(true);
                }else{
                    packPurInformation.setIsSuccess(false);
                }
                //套餐信息对象
                packPurInformation.setPackageInformation(packageInformation);
                packPurInformationList.add(packPurInformation);
                /**
                 * 根据是否购买成功，决定是否扣除用户的余额，
                 * 如果不成功(false) 不扣除用户的余额，"输出您的余额已不足，请及时充值"，
                 * 否则扣除用户的余额
                 */
                if(packPurInformation.getIsSuccess()){
                    //扣除用户余额
                    customer.setBalance(customer.getBalance().doubleValue()-packPurInformation.getAmountOfPayment().doubleValue());
                    //更新套餐信息
                    customer.setPackageInformation(packageInformation);
                }else{
                    System.out.println("输出您的余额已不足，请及时充值!");
                }
            }
            //添加购买信息记录
            packPurInformationSrevice.savePackPurInforByPackPurInfList(packPurInformationList);
            //定义客户信息服务
            CustomerService customerService=new CustomerServiceImpl();
            //更新客户信息
            System.out.println(customerService.updateCustomerByCustomerList(customerList));

        }
        return packageInformation;
    }



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
    @Override
    public PackageInformation salePackage(Double monthlyRent, Integer flowNumber,PackageInformation packageInformation,List<Customer> customerList){
        //定义购买记录集合
        List<PackPurInformation> packPurInformationList = new ArrayList<PackPurInformation>();
        //是否有彩铃
        packageInformation.setMonthlyRent(monthlyRent);
        //月租
        packageInformation.setFlowNumber(flowNumber);
        //定义套餐星系服务
        PackageInformationService packageInformationService = new PackageInformationServiceImpl();
        //添加套餐信息
        packageInformationService.savePackageInformation(packageInformation);
        //定义购买记录服务
        PackPurInformationSrevice packPurInformationSrevice = new PackPurInformationSreviceImpl();
        //判断购买客户不为空
        if (customerList != null && customerList.size()>0) {
            for (int i = 0; i < customerList.size() ; i++) {
                Customer customer = customerList.get(i);
                //定义购买记录对象
                PackPurInformation packPurInformation = new PackPurInformation();
                //设置购买时间
                packPurInformation.setBuyTime(new Date());
                //价格
                packPurInformation.setAmountOfPayment(packageInformation.getMonthlyRent());
                //购买客户
                packPurInformation.setCustomer(customerList.get(i));
                //生效日期
                packPurInformation.setEffectTime(new Date());
                //判断用户的余额是否足够购买套餐
                if (customer.getBalance()!=null && packageInformation.getMonthlyRent()!=null &&
                        (customer.getBalance().doubleValue() >= packageInformation.getMonthlyRent().doubleValue())){
                    //是否成功 true-是，false-否
                    packPurInformation.setIsSuccess(true);
                }else{
                    packPurInformation.setIsSuccess(false);
                }
                //套餐信息对象
                packPurInformation.setPackageInformation(packageInformation);
                packPurInformationList.add(packPurInformation);
                /**
                 * 根据是否购买成功，决定是否扣除用户的余额，
                 * 如果不成功(false) 不扣除用户的余额，"输出您的余额已不足，请及时充值"，
                 * 否则扣除用户的余额
                 */
                if(packPurInformation.getIsSuccess()){
                    //扣除用户余额
                    customer.setBalance(customer.getBalance().doubleValue()-packPurInformation.getAmountOfPayment().doubleValue());
                    //更新套餐信息
                    customer.setPackageInformation(packageInformation);
                }else{
                    System.out.println("输出您的余额已不足，请及时充值!");
                }
            }
            //添加购买信息记录
            packPurInformationSrevice.savePackPurInforByPackPurInfList(packPurInformationList);
            //定义客户信息服务
            CustomerService customerService=new CustomerServiceImpl();
            //更新客户信息
            System.out.println(customerService.updateCustomerByCustomerList(customerList));

        }
        return packageInformation;
    }
    /**
     * @Title: salePackage
     * @Description: 彩铃和月租套餐
     * @author wangzhenxin
     * @date 2017-08-24
     * @param stringObjectMap 套餐销售信息集合
     * @key packageInformation 套餐对象 isColorBack 是否有彩铃 monthlyRent 月租信息 customerList 客户信息集合
     */
    @Override
    public PackageInformation salePackage(Map<String, Object> stringObjectMap) {
        //从map中获取对应的套餐对象
        PackageInformation packageInformation = (PackageInformation) stringObjectMap.get("packageInformation");
        //从map中获取是否有彩铃
        Boolean isColorBack = (Boolean)stringObjectMap.get("isColorBack");
        //从map中获取月租信息
        Double monthlyRent = (Double)stringObjectMap.get("monthlyRent");
        //从map中获取客户信息集合
        List<Customer> customerList = (List<Customer>)stringObjectMap.get("customerList");
        //定义购买记录集合
        List<PackPurInformation> packPurInformationList = new ArrayList<PackPurInformation>();
        //是否有彩铃
        packageInformation.setIsColorBack(isColorBack);
        //月租
        packageInformation.setMonthlyRent(monthlyRent);
        //定义套餐星系服务
        PackageInformationService packageInformationService = new PackageInformationServiceImpl();
        //添加套餐信息
        packageInformationService.savePackageInformation(packageInformation);
        //定义购买记录服务
        PackPurInformationSrevice packPurInformationSrevice = new PackPurInformationSreviceImpl();
        //判断购买客户不为空
        if (customerList != null && customerList.size()>0) {
            for (int i = 0; i < customerList.size() ; i++) {
                Customer customer = customerList.get(i);
                //定义购买记录对象
                PackPurInformation packPurInformation = new PackPurInformation();
                //设置购买时间
                packPurInformation.setBuyTime(new Date());
                //价格
                packPurInformation.setAmountOfPayment(packageInformation.getMonthlyRent());
                //购买客户
                packPurInformation.setCustomer(customerList.get(i));
                //生效日期
                packPurInformation.setEffectTime(new Date());
                //判断用户的余额是否足够购买套餐
                if (customer.getBalance()!=null && packageInformation.getMonthlyRent()!=null &&
                        (customer.getBalance().doubleValue() >= packageInformation.getMonthlyRent().doubleValue())){
                    //是否成功 true-是，false-否
                    packPurInformation.setIsSuccess(true);
                }else{
                    packPurInformation.setIsSuccess(false);
                }
                //套餐信息对象
                packPurInformation.setPackageInformation(packageInformation);
                packPurInformationList.add(packPurInformation);
                /**
                 * 根据是否购买成功，决定是否扣除用户的余额，
                 * 如果不成功(false) 不扣除用户的余额，"输出您的余额已不足，请及时充值"，
                 * 否则扣除用户的余额
                 */
                if(packPurInformation.getIsSuccess()){
                    //扣除用户余额
                    customer.setBalance(customer.getBalance().doubleValue()-packPurInformation.getAmountOfPayment().doubleValue());
                    //更新套餐信息
                    customer.setPackageInformation(packageInformation);
                }else{
                    System.out.println("输出您的余额已不足，请及时充值!");
                }
            }
            //添加购买信息记录
            packPurInformationSrevice.savePackPurInforByPackPurInfList(packPurInformationList);
            //定义客户信息服务
            CustomerService customerService=new CustomerServiceImpl();
            //更新客户信息
            System.out.println(customerService.updateCustomerByCustomerList(customerList));

        }
        return packageInformation;
    }
}
