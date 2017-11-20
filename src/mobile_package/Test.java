package mobile_package;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package
 * @author wangzhenxin
 * @date 2017-08-17 19:59
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */


import mobile_package.entity.Customer;
import mobile_package.entity.PackageInformation;
import mobile_package.service.*;

import java.util.*;

/**
 * @author wangzhenxin
 * @ClassName Test
 * @Description 测试类
 * @date 2017-08-17
 */
public class Test {
    public static void main(String[] args) {
        //定义参数map
        Map<String,Object> stringObjectMap = new HashMap<String, Object>();
        //定义套餐对象
        PackageInformation packageInformation = new PackageInformation();
        //设置彩铃
        packageInformation.setIsColorBack(true);
        //设置套餐月租
        packageInformation.setMonthlyRent(55d);
        //定义购买客户集合
        List<Customer> customerList = new ArrayList<Customer>();
        //将套餐对象传入map
        stringObjectMap.put("packageInformation",packageInformation);
        //将彩铃信息传入map
        stringObjectMap.put("isColorBacsk",packageInformation.getIsColorBack());
        //将月租信息传入map
        stringObjectMap.put("monthlyRent",packageInformation.getMonthlyRent());
        //将客户集合传入map
        stringObjectMap.put("customerList",customerList);
        //定义套餐购买用户service
        PromotionService promotionService = new PromotionServiceImpl();
        //调用实现
        promotionService.salePackage(stringObjectMap);
    }
}
